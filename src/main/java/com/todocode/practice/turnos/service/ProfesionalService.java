package com.todocode.practice.turnos.service;


import com.todocode.practice.turnos.model.Profesional;

import java.util.List;

public interface ProfesionalService {

    Profesional crearProfesional(Profesional profesional);

    List<Profesional> listarProfesionales();

    Profesional buscarProfesional(Long id);

    Profesional actualizarProfesional(Long id, Profesional profesional);

    void eliminarProfesional(Long id);
}
