package com.todocode.practice.turnos.service;

import com.todocode.practice.turnos.model.Turno;

import java.util.List;

public interface TurnoService {

    Turno crearTurno(Turno turno);

    List<Turno> listarTurnos();

    Turno buscarTurno(Long id);

    void eliminarTurno(Long id);

    Turno actualizarTurno(Long id, Turno turno);
}
