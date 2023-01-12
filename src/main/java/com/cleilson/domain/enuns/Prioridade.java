package com.cleilson.domain.enuns;

public enum Prioridade {
	BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");
	
	private Integer codigo;
	private String decricao;
	
	private Prioridade(Integer codigo, String decricao) {
		this.codigo = codigo;
		this.decricao = decricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDecricao() {
		return decricao;
	}
	
	public static Prioridade toEnum(Integer cod) {
		if(cod == null) {	
			return null;
		}
		
		for(Prioridade x : Prioridade.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("PRIORIDADE INVÁLIDO");
	}
}
