package com.itaucartoes.route;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.apicartoes.dao.Pessoa1DAO;
import com.apicartoes.entity.Pessoa;
import com.apicartoes.entity.Pessoa1;

public class PessoaService {
	
	@Autowired
	Pessoa1DAO pessoa1DAO;
	
	List<Pessoa> findAll(){
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		List<Pessoa1> listaPessoas1 = pessoa1DAO.findAll();
		List<Pessoa1> listaPessoas2 = pessoa1DAO.findAll();
		List<Pessoa1> listaPessoas3 = pessoa1DAO.findAll();
		if(!listaPessoas1.isEmpty()) {
			listaPessoas.addAll(listaPessoas1);
		}
		if(!listaPessoas2.isEmpty()) {
			listaPessoas.addAll(listaPessoas1);
		}
		if(!listaPessoas3.isEmpty()) {
			listaPessoas.addAll(listaPessoas1);
		}
		
		return listaPessoas;
		
	}

}
