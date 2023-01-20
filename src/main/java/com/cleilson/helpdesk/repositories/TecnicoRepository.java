package com.cleilson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilson.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
