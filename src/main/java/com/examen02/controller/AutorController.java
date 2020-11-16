package com.examen02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen02.entity.Autor;
import com.examen02.service.AutorService;

@RestController
@RequestMapping("/api/rest/autor/")
public class AutorController {

	@Autowired
	private AutorService service;
	
	@PostMapping
	public ResponseEntity<Autor>inserta(@RequestBody Autor obj){
		return ResponseEntity.ok(service.inserta(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<Autor>>listaAutor(){
		return ResponseEntity.ok(service.listaAutor());
	}
}
