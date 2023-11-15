package com.formacionbdi.springboot.app.patient.models.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pacientes")
public class Pacientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    
    private String aPaterno;
    
    private String aMaterno;
    private char sexo;
    private Integer edad;
    private String telefono;
    private String email;
    
    //Estos son de la otra tabla.

    
    private String estadoClinico;
    private String tratamiento;
    private char caries; 

    
    //@Temporal(TemporalType.DATE)+
    private String firstDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoClinico() {
        return estadoClinico;
    }

    public void setEstadoClinico(String estadoClinico) {
        this.estadoClinico = estadoClinico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public char getCaries() {
        return caries;
    }

    public void setCaries(char caries) {
        this.caries = caries;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public Pacientes(Long id, String nombre, String aPaterno, String aMaterno, char sexo, Integer edad, String telefono,
            String email, String estadoClinico, String tratamiento, char caries, String firstDate) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.sexo = sexo;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.estadoClinico = estadoClinico;
        this.tratamiento = tratamiento;
        this.caries = caries;
        this.firstDate = firstDate;
    }

    public Pacientes(Long id) {
        super();
        this.id = id;
    }

    public Pacientes() {
        super();
    }

    
}
