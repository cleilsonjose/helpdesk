package com.cleilson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilson.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
