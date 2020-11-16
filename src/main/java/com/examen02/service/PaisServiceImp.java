package com.examen02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen02.entity.Pais;
import com.examen02.repository.PaisRepository;

@Service
public class PaisServiceImp implements PaisService{

	@Autowired
	private PaisRepository repository;
	
	@Override
	public List<Pais> listaPais() {
		return repository.findAll();
	}

}
