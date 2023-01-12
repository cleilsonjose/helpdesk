package com.cleilson.domain.enuns;

public enum Status {
	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");
	
	private Integer codigo;
	private String decricao;
	
	private Status(Integer codigo, String decricao) {
		this.codigo = codigo;
		this.decricao = decricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDecricao() {
		return decricao;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod == null) {	
			return null;
		}
		
		for(Status x : Status.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("STATUS INVÁLIDO");
	}
}
