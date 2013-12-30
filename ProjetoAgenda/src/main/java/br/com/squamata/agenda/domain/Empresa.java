package br.com.squamata.agenda.domain;


import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="empresa")
public class Empresa {

	@Id
	private ObjectId id;
	
	@NotEmpty(message="Preencha o campo Razão Social")
	private String razaoSocial;
	
	@NotEmpty(message="Preencha o campo Nome Fantasia")
	private String nomeFantasia;
	
	@NotEmpty(message="Preencha o campo CNPJ")
	private String cnpj;
	
	private String telefone;
	
	@NotEmpty(message="Preencha o campo Responsável")
	private String responsavel;
	
	@DBRef
	private Endereco endereco = new Endereco();

	@Valid
	@DBRef
	private Usuario usuario = new Usuario();

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
