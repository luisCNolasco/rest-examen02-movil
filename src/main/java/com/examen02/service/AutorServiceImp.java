package com.examen02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen02.entity.Autor;
import com.examen02.repository.AutorRepository;

@Service
public class AutorServiceImp implements AutorService{

	@Autowired
	AutorRepository repository;
	@Override
	public Autor inserta(Autor obj) {
		return repository.save(obj);
	}

	@Override
	public List<Autor> listaAutor() {
		return repository.findAll();
	}

}
