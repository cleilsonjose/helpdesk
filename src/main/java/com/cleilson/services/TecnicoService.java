package com.cleilson.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleilson.domain.Tecnico;
import com.cleilson.repositories.TecnicoRepository;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findbyId(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
