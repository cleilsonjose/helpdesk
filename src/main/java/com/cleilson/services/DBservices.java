package com.cleilson.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleilson.domain.Chamado;
import com.cleilson.domain.Cliente;
import com.cleilson.domain.Tecnico;
import com.cleilson.domain.enuns.Perfil;
import com.cleilson.domain.enuns.Prioridade;
import com.cleilson.domain.enuns.Status;
import com.cleilson.repositories.ChamadoRepository;
import com.cleilson.repositories.ClienteRepository;
import com.cleilson.repositories.TecnicoRepository;

@Service
public class DBservices {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Israel Afonso", "199.549.750-98", "israel@mail.com", "123456");
		tec1.addPerfil(Perfil.ADMIN);
		
		Tecnico tec2 = new Tecnico(null, "Livia Flaviane", "555.137.935-39", "liviaF@mail.com", "123456");
		tec1.addPerfil(Perfil.TECNICO);
		
		Cliente cli1 = new Cliente(null, "Linus T", "891.315.453-60", "linux@mail.com", "123");
		Cliente cli2 = new Cliente(null, "Lula da Silva", "123.581.995-75", "lulo@mail.com", "123");
		Cliente cli3 = new Cliente(null, "Mario", "331.696.543-22", "mario@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, 
				"Chamado 01", "Primeiro Chamado", cli1, tec1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, 
				"Chamado 02", "Segundo Chamado", cli2, tec2);
		Chamado c3 = new Chamado(null, Prioridade.MEDIA, Status.ENCERRADO, 
				"Chamado 03", "Entregue", cli3, tec1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3));
	}
}
