package com.apicartoes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicartoes.entity.Pessoa1;
import com.apicartoes.entity.Pessoa2;

public interface Pessoa2DAO extends JpaRepository<Pessoa2, Long>{
	
	List<Pessoa2> findAllById(Long id);
	
	List<Pessoa2> findAll();

}
