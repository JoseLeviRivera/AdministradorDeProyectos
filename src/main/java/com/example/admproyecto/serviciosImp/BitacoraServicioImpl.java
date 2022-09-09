package com.example.admproyecto.serviciosImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admproyecto.interfaces.BitacoraRepository;
import com.example.admproyecto.model.Bitacora;
import com.example.admproyecto.servicios.BitacoraServicio;

@Service
public class BitacoraServicioImpl implements BitacoraServicio{
	
	@Autowired
	private BitacoraRepository repositorio;

	@Override
	public List<Bitacora> listaTiempos() {
		return repositorio.findAll();
	}

	@Override
	public Bitacora guardarTiempo(Bitacora b) {
		return this.repositorio.save(b);
	}

	@Override
	public Bitacora obtenerTiempoId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Bitacora actualizarTiempo(Bitacora b) {
		return repositorio.save(b);
	}

	@Override
	public void eliminarTiempo(Long id) {
		repositorio.deleteById(id);
	}

}

