package com.formacionbdi.springboot.app.citas.models.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class Citas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String fecha;
	@Column
	private String hora;
	@Column
	private String paciente;
	@Column
	private Long telefono;
	@Column
	private String p_cita;
	@Column
	private String pro_cita;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getP_cita() {
		return p_cita;
	}

	public void setP_cita(String p_cita) {
		this.p_cita = p_cita;
	}

	public String getPro_cita() {
		return pro_cita;
	}

	public void setPro_cita(String pro_cita) {
		this.pro_cita = pro_cita;
	}

	public Citas() {
		super();
	}

	public Citas(Integer id, String fecha, String hora, String paciente, Long telefono, String p_cita, String pro_cita) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.paciente = paciente;
		this.telefono = telefono;
		this.p_cita = p_cita;
		this.pro_cita = pro_cita;
	}

	public Citas(Integer id) {
		super();
		this.id = id;
	}

}
