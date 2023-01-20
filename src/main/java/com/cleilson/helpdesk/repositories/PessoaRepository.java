package com.cleilson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilson.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
