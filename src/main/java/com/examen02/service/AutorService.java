package com.examen02.service;

import java.util.List;

import com.examen02.entity.Autor;

public interface AutorService {

	public abstract Autor inserta(Autor obj);
	public abstract List<Autor>listaAutor();
}
