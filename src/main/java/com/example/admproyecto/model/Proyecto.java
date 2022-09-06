package com.example.admproyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "proyectos")
public class Proyecto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_Proyecto")
	private Integer id;
	@Column(nullable = false, length = 50)
	public String nombre;
	@Column(nullable = false, length = 15)
	public String estado;
	
	public Proyecto() {
		
	}
	public Proyecto(Integer id, String nombrePro, String estado) {
		this.id = id;
		this.nombre = nombrePro;
		this.estado = estado;
	}
	public Proyecto(String nombrePro, String estado) {		
		this.nombre = nombrePro;
		this.estado = estado;
	}
	
	public Integer getId() {
		return id;
	}	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombrePro) {
		this.nombre = nombrePro;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
