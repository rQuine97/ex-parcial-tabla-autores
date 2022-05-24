package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idautor;
	
	@Column(name = "nombres",nullable = false, length = 40)
	private String nombres;
	
	@Column(name = "apellidos",nullable = false, length = 40)
	private String apellidos;
	
	@Column(name = "correo",nullable = false, length = 40,unique = true)
	private String correo;
	
	public Autor() {
		
	}

	public Autor(int idautor, String nombres, String apellidos, String correo) {
		super();
		this.idautor = idautor;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
	}
	
	public Autor(String nombres, String apellidos, String correo) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
	}

	public int getIdautor() {
		return idautor;
	}

	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Autor [idautor=" + idautor + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo
				+ "]";
	}

		
}
