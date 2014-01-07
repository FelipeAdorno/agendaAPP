package br.com.squamata.agenda.service.provider;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.squamata.agenda.domain.Empresa;
import br.com.squamata.agenda.nullObject.EnderecoNullObject;
import br.com.squamata.agenda.repositories.EmpresaRepository;
import br.com.squamata.agenda.repositories.EnderecoRepository;
import br.com.squamata.agenda.service.EmpresaService;
import br.com.squamata.agenda.service.UsuarioService;

@Service(value="empresaService")
public class EmpresaServiceProvider implements EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	

	@Override
	public void salvar(Empresa entrada) {

		if(entrada.getEndereco() == null) {
			entrada.setEndereco(new EnderecoNullObject());
		}
		
		//PARASSAR CADA UM PARA SEU SERVIÇO
		enderecoRepository.save(entrada.getEndereco());
		
		empresaRepository.save(entrada);
		
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
	
}
