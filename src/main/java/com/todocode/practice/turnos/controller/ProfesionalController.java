package com.todocode.practice.turnos.controller;


import com.todocode.practice.turnos.model.Paciente;
import com.todocode.practice.turnos.model.Profesional;
import com.todocode.practice.turnos.service.PacienteService;
import com.todocode.practice.turnos.service.ProfesionalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesionales")
public class ProfesionalController {

    private final ProfesionalService profesionalService;

    public ProfesionalController(ProfesionalService profesionalService) {
        this.profesionalService = profesionalService;
    }

    @PostMapping
    public Profesional crearProfesional(@RequestBody Profesional profesional) {
        return profesionalService.crearProfesional(profesional);
    }

    @GetMapping
    public List<Profesional> listarProfesional() {
        return profesionalService.listarProfesionales();
    }

    @GetMapping("/{id}")
    public Profesional buscarProfesional(@PathVariable Long id) {
        return profesionalService.buscarProfesional(id);
    }

    @PutMapping("/{id}")
    public Profesional actualizarProfesional(
            @PathVariable Long id,
            @RequestBody Profesional profesional) {

        return profesionalService.actualizarProfesional(id, profesional);
    }

    @DeleteMapping("/{id}")
    public void  eliminarProfesional(@PathVariable Long id) {
        profesionalService.eliminarProfesional(id);
    }



}
