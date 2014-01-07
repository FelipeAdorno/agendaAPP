package br.com.squamata.agenda.service.provider;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.squamata.agenda.domain.Role;
import br.com.squamata.agenda.domain.Usuario;
import br.com.squamata.agenda.enumeration.TipoUsuarioEnum;
import br.com.squamata.agenda.repositories.UsuarioRepository;
import br.com.squamata.agenda.service.EmpresaService;
import br.com.squamata.agenda.service.UsuarioService;

@Service(value="usuarioService")
public class UsuarioServiceProvider implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private EmpresaService empresaService;
	
	@Autowired 
	private PasswordEncoder encoder;

	@Override
	public Usuario buscarPorNomeUsuario(String nomeUsuario) {
		return usuarioRepository.findByNomeUsuario(nomeUsuario);
	}
	
	public void salvarNovoCadastroNoSistema(Usuario entrada) {
		entrada.getRoles().add(new Role(TipoUsuarioEnum.ADMIN.getRole()));
		entrada.setHabilitado(Boolean.TRUE);
		
		//criptografado a senha
		entrada.setSenha(this.criptografarSenha(entrada.getSenha()));
		
		this.salvar(entrada);
	}

	@Override
	public void salvar(Usuario entrada) {
		
		//salvando a empresa
		empresaService.salvar(entrada.getEmpresa());
		
		usuarioRepository.save(entrada);
		
	}
	
	private String criptografarSenha(String senha) {
		return encoder.encode(senha);
	}

	@Override
	public void atualizar(Usuario entrada) {
		usuarioRepository.save(entrada);
	}

	@Override
	public void remover(ObjectId id) {
		usuarioRepository.delete(id);
	}

	@Override
	public Usuario buscarPorId(ObjectId id) {
		return usuarioRepository.findOne(id);
	}

	@Override
	public Page<Usuario> listar(Integer paginaAtual, Integer quantidadeRegistros, String ordenacao) {
		final PageRequest pageRequest = new PageRequest(paginaAtual, quantidadeRegistros, new Sort(Sort.Direction.ASC, ordenacao));
		return usuarioRepository.findAll(pageRequest);
	}

	

}
