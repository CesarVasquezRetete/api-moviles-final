package com.example.service;

import java.util.List;

import com.example.entity.Libro;

public interface LibroService {

	public List<Libro> listarTodos();

	public List<Libro> listarPorTitulo(String filtro);

}
