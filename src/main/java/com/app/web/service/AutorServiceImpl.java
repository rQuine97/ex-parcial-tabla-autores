package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Autor;
import com.app.web.repositorio.AutorRepositorio;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorRepositorio repositorio;
	
	@Override
	public List<Autor> listarTodosLosAutores() {
		return repositorio.findAll();
	}

	@Override
	public Autor guardarAutor(Autor autor) {
		return repositorio.save(autor);
	}

	@Override
	public Autor obtenerAutorPorId(Integer idautor) {
		return repositorio.findById(idautor).get();
	}

	@Override
	public Autor actualizarAutor(Autor autor) {
		return repositorio.save(autor);
	}

	@Override
	public void eliminarAutor(Integer idautor) {
		repositorio.deleteById(idautor);
		
	}
	
	
}
