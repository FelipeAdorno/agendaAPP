package br.com.squamata.agenda.enumeration;

public enum TipoUsuarioEnum {

	ADMIN(1, "ROLE_ADMIN"),
	OPERADOR(2, "ROLE_OPERADOR"),
	USUARIO(3, "ROLE_USER");
	
	private Integer id;
	
	private String role;
	
	private TipoUsuarioEnum(final int id, final String role) {
		this.id = id;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public String getRole() {
		return role;
	}
	
}
