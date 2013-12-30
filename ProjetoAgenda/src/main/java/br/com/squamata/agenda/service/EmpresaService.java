package br.com.squamata.agenda.service;

import org.bson.types.ObjectId;

import br.com.squamata.agenda.domain.Empresa;



public interface EmpresaService extends AbstractService<Empresa, ObjectId> {
	
	Empresa buscarPorUsuarioNomeUsuario(String nomeUsuario);
}
