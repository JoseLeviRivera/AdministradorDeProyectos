package com.example.admproyecto.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.admproyecto.model.Sprint;


public interface SprintRepository extends JpaRepository<Sprint, Long>{

}
