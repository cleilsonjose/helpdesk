package com.cleilson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilson.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
