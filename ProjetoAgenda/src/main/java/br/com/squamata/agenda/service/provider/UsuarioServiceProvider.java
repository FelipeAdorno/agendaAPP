package br.com.squamata.agenda.service.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.squamata.agenda.domain.Usuario;
import br.com.squamata.agenda.repositories.UsuarioRepository;
import br.com.squamata.agenda.service.UsuarioService;

@Service(value="usuarioService")
public class UsuarioServiceProvider implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario buscarPorNomeUsuario(String nomeUsuario) {
		return usuarioRepository.findByNomeUsuario(nomeUsuario);
	}

}
