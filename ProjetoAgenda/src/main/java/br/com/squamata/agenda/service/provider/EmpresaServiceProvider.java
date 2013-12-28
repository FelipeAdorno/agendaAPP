package br.com.squamata.agenda.service.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.squamata.agenda.domain.Empresa;
import br.com.squamata.agenda.repositories.EmpresaRepository;
import br.com.squamata.agenda.service.EmpresaService;

@Service(value="empresaService")
public class EmpresaServiceProvider implements EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public void salvar(Empresa entrada) {
		empresaRepository.save(entrada);
	}

	@Override
	public void atualizar(Empresa entrada) {
		empresaRepository.save(entrada);
	}

	@Override
	public void remover(Integer id) {
		empresaRepository.delete(id);
	}

	@Override
	public Empresa buscarPorId(Integer id) {
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
