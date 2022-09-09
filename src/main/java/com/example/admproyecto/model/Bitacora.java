package com.example.admproyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  ="bitacora")
public class Bitacora {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 45, name = "fecha_inicio") 
    private String fechaInicio;
	
	@Column(nullable = false, length = 45, name = "hora_inicio") 
    private String hora_inicio;
	
	@Column(nullable = false, length = 45, name = "hora_final") 
    private String hora_final;
	
	@Column(nullable = false, name = "interrupcion")
	private int interrupcion;
	
	@Column(nullable = false, length = 45, name = "etapa")
	private String etapa;
	
	@Column(nullable = false, length = 45, name = "actividad_no_planeada")
	private String actividad_no_planeada;
	
	@Column(nullable = false, length = 45, name = "proyecto")
	private String proyecto;
	
	@Column(nullable = false, length = 45, name = "artefacto")
	private String artefacto;
	
	public Bitacora() {}

	public Bitacora(String fechaInicio, String hora_inicio, String hora_final, int interrupcion, String etapa,
			String actividad_no_planeada, String proyecto, String artefacto) {
		this.fechaInicio = fechaInicio;
		this.hora_inicio = hora_inicio;
		this.hora_final = hora_final;
		this.interrupcion = interrupcion;
		this.etapa = etapa;
		this.actividad_no_planeada = actividad_no_planeada;
		this.proyecto = proyecto;
		this.artefacto = artefacto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public String getHora_final() {
		return hora_final;
	}

	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}

	public int getInterrupcion() {
		return interrupcion;
	}

	public void setInterrupcion(int interrupcion) {
		this.interrupcion = interrupcion;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getActividad_no_planeada() {
		return actividad_no_planeada;
	}

	public void setActividad_no_planeada(String actividad_no_planeada) {
		this.actividad_no_planeada = actividad_no_planeada;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public String getArtefacto() {
		return artefacto;
	}

	public void setArtefacto(String artefacto) {
		this.artefacto = artefacto;
	}
	
	
}
