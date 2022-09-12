package com.example.admproyecto.serviciosImp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admproyecto.interfaces.HistoriaRepository;
import com.example.admproyecto.model.Historia;
import com.example.admproyecto.servicios.HistoriaServicios;

@Service
public class HistoriaServicioImp implements HistoriaServicios{	

	@Autowired
	private HistoriaRepository histRepos;
	
	@Override
	public List<Historia> listarHistorias() {		
		return histRepos.findAll();
	}

	@Override
	public Historia registrarHistoria(Historia historia) {
		return histRepos.save(historia);
	}

	@Override
	public Historia obtenerHistoriaID(Integer id) {
		return histRepos.findById(id).get();
	}

	@Override
	public Historia actualizarHistoria(Historia historia) {	
		return histRepos.save(historia);
	}

	@Override
	public void eliminarHistoria(Integer id) {		
		histRepos.deleteById(id); 
	}

}
