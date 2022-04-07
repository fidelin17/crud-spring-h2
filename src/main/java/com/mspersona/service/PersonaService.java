package com.mspersona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mspersona.entity.Persona;
import com.mspersona.repository.PersonaRepository;
@Service
public class PersonaService implements metodos{
	@Autowired
	PersonaRepository repo;

	@Override
	public Persona guardar(Persona per) {
		return repo.save(per);
	}

	@Override
	public Persona actualizar(Persona per) {
		// TODO Auto-generated method stub
		return repo.save(per);
	}

	@Override
	public Object buscar(int id) {

		return repo.findById(id);
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List<Persona> listartodos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
