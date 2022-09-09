package com.example.admproyecto.serviciosImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admproyecto.interfaces.SprintRepository;
import com.example.admproyecto.model.Sprint;
import com.example.admproyecto.servicios.SprintServicio;

@Service
public class SprintServicioImpl implements SprintServicio{
	
	@Autowired
	private SprintRepository repositorio;

	@Override
	public List<Sprint> listarSprints() {	
		return repositorio.findAll();
	}

	@Override
	public Sprint guardarSprint(Sprint sprint) {
		return this.repositorio.save(sprint);
	}

	@Override
	public Sprint obtenerSprintId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Sprint actualizarSprint(Sprint sprint) {
		return repositorio.save(sprint);
	}

	@Override
	public void eliminarSprint(Long id) {
		repositorio.deleteById(id);
	}


}
