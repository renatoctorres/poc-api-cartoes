package com.apicartoes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicartoes.entity.Pessoa1;

public interface Pessoa1DAO extends JpaRepository<Pessoa1, Long>{
	
	List<Pessoa1> findAllById(Long id);
	
	List<Pessoa1> findAll();

}
