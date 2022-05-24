package com.app.web.service;

import java.util.List;

import com.app.web.entidad.Autor;

public interface AutorService {
	
	public List<Autor> listarTodosLosAutores();
	
	public Autor guardarAutor(Autor autor);
	
	public Autor obtenerAutorPorId(Integer idautor);
	
	public Autor actualizarAutor(Autor autor);
	
	public void eliminarAutor(Integer idautor);
}
