package com.example.admproyecto.servicios;

import java.util.List;

import com.example.admproyecto.model.Historia;

public interface HistoriaServicios {
	public List<Historia> listarHistorias();
	public Historia registrarHistoria(Historia historia);
	public Historia obtenerHistoriaID(Integer id);
	public Historia actualizarHistoria(Historia historia);
	public void eliminarHistoria(Integer id);
}
