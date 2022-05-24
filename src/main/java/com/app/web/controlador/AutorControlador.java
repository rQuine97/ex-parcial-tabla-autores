package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Autor;
import com.app.web.service.AutorService;

@Controller
public class AutorControlador {
	
	@Autowired
	private AutorService servicio;
	
	@GetMapping({"/autores","/"})
	public String listarAutores(Model modelo) {
		modelo.addAttribute("autores",servicio.listarTodosLosAutores());
		return "autores"; // Esto nos retorna al archivo autores
	}
	
	@GetMapping("/autores/nuevo")
	public String mostrarFormularioDeRegistrarAutor(Model modelo) {
		Autor autor = new Autor();
		modelo.addAttribute("autor", autor);
		return "crear_autor";
		
	}
	
	@PostMapping("/autores")
	public String guardarAutor(@ModelAttribute("autor") Autor autor) {
		servicio.guardarAutor(autor);
		return "redirect:/autores";
		
	}
	
	@GetMapping("/autores/editar/{idautor}")
	public String mostrarFormularioDeEditar(@PathVariable Integer idautor, Model modelo) {
		modelo.addAttribute("autor", servicio.obtenerAutorPorId(idautor));
		return "editar_autor";
	}
	
	@PostMapping("/autores/{idautor}")
	public String actualizarAutor(@PathVariable Integer idautor, @ModelAttribute("autor") Autor autor, Model modelo) {
		Autor autorExistente = servicio.obtenerAutorPorId(idautor);
		autorExistente.setIdautor(idautor);
		autorExistente.setNombres(autor.getNombres());
		autorExistente.setApellidos(autor.getApellidos());
		autorExistente.setCorreo(autor.getCorreo());

		servicio.actualizarAutor(autorExistente);
		return "redirect:/autores";
	}
	
	@GetMapping("/autores/{idautor}")
	public String eliminarAutor(@PathVariable Integer idautor) {
		servicio.eliminarAutor(idautor);
		return "redirect:/autores";
	}
	
}
