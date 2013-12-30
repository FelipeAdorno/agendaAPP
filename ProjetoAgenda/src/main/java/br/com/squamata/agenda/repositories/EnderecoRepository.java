package br.com.squamata.agenda.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.squamata.agenda.domain.Endereco;

@Repository
public interface EnderecoRepository extends PagingAndSortingRepository<Endereco,ObjectId> {

}
