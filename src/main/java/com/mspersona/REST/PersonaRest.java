package com.mspersona.REST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mspersona.entity.Persona;
import com.mspersona.service.PersonaService;

@RestController
@RequestMapping("api/persona")
public class PersonaRest {
	@Autowired
	PersonaService service;
	@PostMapping
	public Persona guardar(@RequestBody Persona per) {
		return service.guardar(per);
		
	}
	@PutMapping
	public Persona editar(@RequestBody Persona per) {
		return service.guardar(per);
		
	}
	
	@GetMapping
	List<Persona> listar(){
		return service.listartodos();
	}
	
	@DeleteMapping("/{id}")
	public String eliminar(@PathVariable("id")int id) {
		return service.eliminar(id);
		
	}
	
	@GetMapping("buscar/{id}")
	public Object buscarporid(@PathVariable("id")int id) {
		return service.buscar(id);
		
	}
	
	
	

}
