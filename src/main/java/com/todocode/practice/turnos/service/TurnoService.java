package com.todocode.practice.turnos.service;

import com.todocode.practice.turnos.model.Turno;

import com.todocode.practice.turnos.dto.TurnoResponseDTO;

import java.util.List;

public interface TurnoService {

    Turno crearTurno(Turno turno);

    List<Turno> listarTurnos();

    Turno buscarTurno(Long id);

    void eliminarTurno(Long id);

    Turno actualizarTurno(Long id, Turno turno);

    TurnoResponseDTO convertirDTO(Turno turno);

    List<Turno> buscarPorProfesional(Long profesionalId);

    List<Turno> buscarPorPaciente(Long pacienteId);
}
