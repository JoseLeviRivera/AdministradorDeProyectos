package com.example.admproyecto.servicios;

import java.util.List;

import com.example.admproyecto.model.Sprint;


public interface SprintServicio {
	public List<Sprint> listarSprints();
	public Sprint guardarSprint(Sprint sprint);
	public Sprint obtenerSprintId(Long id);
	public Sprint actualizarSprint(Sprint sprint);
	public void eliminarSprint(Long id);
}
