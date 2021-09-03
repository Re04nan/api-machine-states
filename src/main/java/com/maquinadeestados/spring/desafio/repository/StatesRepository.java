package com.maquinadeestados.spring.desafio.repository;

import com.maquinadeestados.spring.desafio.entity.States;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatesRepository extends JpaRepository<States, Long> {
}
