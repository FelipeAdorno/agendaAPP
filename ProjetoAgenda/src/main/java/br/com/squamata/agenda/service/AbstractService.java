package br.com.squamata.agenda.service;

import org.springframework.data.domain.Page;

public interface AbstractService<Domain, ID> {

	void salvar(Domain entrada);
	
	void atualizar(Domain entrada);
	
	void remover(ID id);
	
	Domain buscarPorId(ID id);
	
	Page<Domain> listar(Integer paginaAtual, Integer quantidadePaginas, String ordenacao);
	
}
