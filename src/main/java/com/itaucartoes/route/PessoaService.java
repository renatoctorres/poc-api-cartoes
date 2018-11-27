package com.itaucartoes.route;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apicartoes.dao.Pessoa1DAO;
import com.apicartoes.dao.Pessoa2DAO;
import com.apicartoes.dao.Pessoa3DAO;
import com.apicartoes.entity.ListaPessoas;
import com.apicartoes.entity.Pessoa;
import com.apicartoes.entity.Pessoa1;
import com.apicartoes.entity.Pessoa2;
import com.apicartoes.entity.Pessoa3;

@Component
public class PessoaService {
	
	@Autowired
	Pessoa1DAO pessoa1DAO;
	
	@Autowired
	Pessoa2DAO pessoa2DAO;
	
	@Autowired
	Pessoa3DAO pessoa3DAO;
	
	public ListaPessoas consultarPessoa(){
		ListaPessoas listaPessoa = new ListaPessoas();
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		List<Pessoa1> listaPessoas1 = pessoa1DAO.findAll();
		List<Pessoa2> listaPessoas2 = pessoa2DAO.findAll();
		List<Pessoa3> listaPessoas3 = pessoa3DAO.findAll();
		if(!listaPessoas1.isEmpty()) {
			listaPessoas.addAll(listaPessoas1);
		}
		if(!listaPessoas2.isEmpty()) {
			listaPessoas.addAll(listaPessoas1);
		}
		if(!listaPessoas3.isEmpty()) {
			listaPessoas.addAll(listaPessoas1);
		}
		listaPessoa.setListaPessoas(listaPessoas);
		
		return listaPessoa;
		
	}

}
