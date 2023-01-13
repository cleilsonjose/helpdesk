package com.cleilson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilson.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
