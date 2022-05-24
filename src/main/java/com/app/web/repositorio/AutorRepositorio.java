package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Autor;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, Integer>{
	
}
