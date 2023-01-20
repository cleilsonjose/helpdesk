package com.cleilson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilson.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
