package com.todocode.practice.turnos.service;

import com.todocode.practice.turnos.model.Paciente;
import java.util.List;

public interface PacienteService {

    Paciente crearPaciente(Paciente paciente);

    List<Paciente> listarPacientes();

    Paciente buscarPaciente(Long id);

}
