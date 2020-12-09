package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
	
	@Query("Select l from Libro l where l.titulo like :var_fil")
	public List<Libro> listaPorTitulo(@Param("var_fil") String filtro);
	
}
