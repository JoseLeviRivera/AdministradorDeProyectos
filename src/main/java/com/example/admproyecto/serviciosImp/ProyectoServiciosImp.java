package com.example.admproyecto.serviciosImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admproyecto.interfaces.ProyectoRepository;
import com.example.admproyecto.model.Proyecto;
import com.example.admproyecto.servicios.ProyectoServicios;

@Service
public class ProyectoServiciosImp implements ProyectoServicios{
	
	@Autowired
	private ProyectoRepository pryRepos;
	
	@Override
	public List<Proyecto> listarProyectos() {
		return pryRepos.findAll();
	}

	@Override
	public Proyecto registrarProyecto(Proyecto pry) { 
		pry.setEstado("Activo");
		return pryRepos.save(pry);
	}

	@Override
	public Proyecto obtenerProyectoID(Integer id) {
		return pryRepos.findById(id).get();
	}

	@Override
	public void eliminarProyecto(Integer id) {
		pryRepos.deleteById(id);
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		return pryRepos.save(proyecto);
	}

}
