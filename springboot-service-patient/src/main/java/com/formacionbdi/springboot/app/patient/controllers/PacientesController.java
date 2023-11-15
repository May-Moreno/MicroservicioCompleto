package com.formacionbdi.springboot.app.patient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.formacionbdi.springboot.app.patient.models.dao.PacientesDao;
import com.formacionbdi.springboot.app.patient.models.entity.Pacientes;


@Controller
public class PacientesController {
    
    @Autowired
    private PacientesDao pacienteService;

    @GetMapping("/pacientes")
    public String listarPacientes(Model modelo)
    {
        List<Pacientes> listaPacientes = pacienteService.findAll();
        modelo.addAttribute("listaPacientes", listaPacientes);
        return "pacientes";
    }

    @GetMapping("/pacientes/nuevo")
    public String crear (Model modelo)
    {
        modelo.addAttribute("pacientes", new Pacientes());
        return "crear_pacientes";
    }

    
    @PostMapping("/pacientes/guardar")
    public String guardarPacientes(Pacientes pacientes)
    {
        pacienteService.save(pacientes);
        return "redirect:/pacientes";
    }
}
