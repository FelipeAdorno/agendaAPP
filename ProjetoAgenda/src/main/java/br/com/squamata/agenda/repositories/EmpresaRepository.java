package br.com.squamata.agenda.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.squamata.agenda.domain.Empresa;

@Repository
public interface EmpresaRepository extends PagingAndSortingRepository<Empresa,Integer> {

	Empresa findByUsuarioNomeUsuario(String nomeUsuario);
	
}
