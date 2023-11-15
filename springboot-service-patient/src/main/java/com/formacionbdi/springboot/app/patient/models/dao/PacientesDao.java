package com.formacionbdi.springboot.app.patient.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formacionbdi.springboot.app.patient.models.entity.Pacientes;

public interface PacientesDao extends JpaRepository <Pacientes, Long>{
    
}
