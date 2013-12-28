package br.com.squamata.agenda.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.squamata.agenda.domain.Usuario;

@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario,Integer> {

	Usuario findByNomeUsuario(String nomeUsuario);
	
}
