package br.com.squamata.agenda.nullObject;

import br.com.squamata.agenda.domain.Endereco;

public class EnderecoNullObject extends Endereco {
	
	public EnderecoNullObject() {
		this.setLogradouro("Não definido!");
		this.setBairro("Não definido!");
		this.setCidade("Não definida!");
	}
}
