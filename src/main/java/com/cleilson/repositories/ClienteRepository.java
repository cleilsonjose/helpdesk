package com.cleilson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilson.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
