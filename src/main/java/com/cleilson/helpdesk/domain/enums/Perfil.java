package com.cleilson.helpdesk.domain.enums;

public enum Perfil {
	ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");
	
	private Integer codigo;
	private String decricao;
	
	private Perfil(Integer codigo, String decricao) {
		this.codigo = codigo;
		this.decricao = decricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDecricao() {
		return decricao;
	}
	
	public static Perfil toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Perfil x : Perfil.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Perfil inválido");
	}
}
