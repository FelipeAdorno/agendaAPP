package br.com.squamata.agenda.service;

import br.com.squamata.agenda.domain.Usuario;

public interface UsuarioService {
	
	Usuario buscarPorNomeUsuario(final String nomeUsuario);
	
}
