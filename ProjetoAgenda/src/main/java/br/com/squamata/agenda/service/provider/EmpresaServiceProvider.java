package br.com.squamata.agenda.service.provider;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.squamata.agenda.domain.Empresa;
import br.com.squamata.agenda.domain.Role;
import br.com.squamata.agenda.enumeration.TipoUsuarioEnum;
import br.com.squamata.agenda.nullObject.EnderecoNullObject;
import br.com.squamata.agenda.repositories.EmpresaRepository;
import br.com.squamata.agenda.repositories.EnderecoRepository;
import br.com.squamata.agenda.repositories.UsuarioRepository;
import br.com.squamata.agenda.service.EmpresaService;

@Service(value="empresaService")
public class EmpresaServiceProvider implements EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired 
	private PasswordEncoder encoder;

	@Override
	public void salvar(Empresa entrada) {
		entrada = adicionarRuleAminEHabilitarUsuarioNovoCadastro(entrada);
		if(entrada.getEndereco() == null) {
			entrada.setEndereco(new EnderecoNullObject());
		}
		
		//PARASSAR CADA UM PARA SEU SERVIÇO
		enderecoRepository.save(entrada.getEndereco());
		
		usuarioRepository.save(entrada.getUsuario());
		
		empresaRepository.save(entrada);
	}

	private Empresa adicionarRuleAminEHabilitarUsuarioNovoCadastro(Empresa entrada) {
		entrada.getUsuario().getRoles().add(new Role(TipoUsuarioEnum.ADMIN.getRole()));
		entrada.getUsuario().setHabilitado(Boolean.TRUE);
		entrada.getUsuario().setSenha(encoder.encode(entrada.getUsuario().getSenha()));
		return entrada;
	}

	@Override
	public void atualizar(Empresa entrada) {
		empresaRepository.save(entrada);
	}

	@Override
	public void remover(ObjectId id) {
		empresaRepository.delete(id);
	}

	@Override
	public Empresa buscarPorId(ObjectId id) {
		return empresaRepository.findOne(id);
	}

	@Override
	public Page<Empresa> listar(Integer paginaAtual, Integer quantidadeRegistros, String ordenacao) {
		final PageRequest pageRequest = new PageRequest(paginaAtual, quantidadeRegistros, new Sort(Sort.Direction.ASC, ordenacao));
		return empresaRepository.findAll(pageRequest);
	}

	@Override
	public Empresa buscarPorUsuarioNomeUsuario(String nomeUsuario) {
		return empresaRepository.findByUsuarioNomeUsuario(nomeUsuario);
	}


	
}
