package com.formacionbdi.springboot.app.citas.models.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CitasController {

	@Autowired
	private CitasRepository citasService;

	@GetMapping("/citas")
	public String listarCitas(Model modelo) {
		List<Citas> listaCitas = citasService.findAll();
		modelo.addAttribute("listaCitas", listaCitas);
		return "citas";
	}
	
	@GetMapping("/citas/nueva")
	public String crear (Model modelo) {
		modelo.addAttribute("citas", new Citas());
		return "crear_cita";
	}

	@PostMapping("/citas/guardar")
	public String guardarCitas(Citas citas) {
		citasService.save(citas);
		return "redirect:/citas";
	}
}
