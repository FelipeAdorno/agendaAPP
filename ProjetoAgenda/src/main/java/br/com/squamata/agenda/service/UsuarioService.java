package br.com.squamata.agenda.service;

import org.bson.types.ObjectId;

import br.com.squamata.agenda.domain.Usuario;

public interface UsuarioService extends AbstractService<Usuario, ObjectId> {
	
	Usuario buscarPorNomeUsuario(final String nomeUsuario);
	
	void salvarNovoCadastroNoSistema(Usuario entrada);
	
}
