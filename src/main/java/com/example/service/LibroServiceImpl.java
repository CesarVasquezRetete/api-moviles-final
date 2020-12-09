package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Libro;
import com.example.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepository repository;
	
	@Override
	public List<Libro> listarTodos() {
		return repository.findAll();
	}

	@Override
	public List<Libro> listarPorTitulo(String filtro) {
		return repository.listaPorTitulo(filtro);
	}
	
}
