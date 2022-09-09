package com.example.admproyecto.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.admproyecto.model.Bitacora;

public interface BitacoraRepository extends JpaRepository<Bitacora, Long>{}
