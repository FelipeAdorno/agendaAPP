package br.com.squamata.agenda.service;

import br.com.squamata.agenda.domain.Empresa;



public interface EmpresaService extends AbstractService<Empresa, Integer> {
	
	Empresa buscarPorUsuarioNomeUsuario(String nomeUsuario);
}
