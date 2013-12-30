package br.com.squamata.agenda.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="usuario")
public class Usuario {
	
	@Id
	private ObjectId id;
	
	@NotEmpty(message="Preencha o campo Nome de Usuário")
	private String nomeUsuario;
	
	@NotEmpty(message="Preencha o campo Senha")
	private String senha;
	
	private Boolean habilitado;
	
	private List<Role> roles = new ArrayList<Role>();

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	 public String getRolesCSV() {
         StringBuilder sb = new StringBuilder();
         for (Iterator<Role> iter = this.roles.iterator(); iter.hasNext(); )
         {
            sb.append(iter.next().getRole());
            if (iter.hasNext()) {
                    sb.append(',');
            }
         }
         return sb.toString();
 }
}
