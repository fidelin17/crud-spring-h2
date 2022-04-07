package com.mspersona.service;

import java.util.List;

import com.mspersona.entity.Persona;

public interface metodos {
	Persona guardar(Persona per);
	Persona actualizar(Persona per);
	Object buscar(int id);
	String eliminar(int id);
	
	List<Persona> listartodos();
	

}
