package com.cleilson.domain;

import java.time.LocalDate;
import java.util.Objects;

import com.cleilson.domain.enuns.Prioridade;
import com.cleilson.domain.enuns.Status;

public class Chamado {
	
	private Integer id;
	private LocalDate dataDeAbertura = LocalDate.now();
	private LocalDate dataDeFechamento;
	private Prioridade prioridade;
	private Status status;
	private String titulo;
	private String observações;
	
	private Cliente cliente;
	private Tecnico tecnico;
	
	public Chamado() {
		super();
	}

	public Chamado(Integer id, Prioridade prioridade, Status status, String titulo, String observações, Cliente cliente,
			Tecnico tecnico) {
		super();
		this.id = id;
		this.prioridade = prioridade;
		this.status = status;
		this.titulo = titulo;
		this.observações = observações;
		this.cliente = cliente;
		this.tecnico = tecnico;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(LocalDate dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public LocalDate getDataDeFechamento() {
		return dataDeFechamento;
	}

	public void setDataDeFechamento(LocalDate dataDeFechamento) {
		this.dataDeFechamento = dataDeFechamento;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservações() {
		return observações;
	}

	public void setObservações(String observações) {
		this.observações = observações;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
