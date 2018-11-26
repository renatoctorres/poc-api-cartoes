package com.apicartoes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicartoes.entity.Pessoa3;

public interface Pessoa3DAO extends JpaRepository<Pessoa3, Long>{
	
	List<Pessoa3> findAllById(Long id);
	
	List<Pessoa3> findAll();

}
