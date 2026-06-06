package com.todocode.practice.turnos.repository;

import com.todocode.practice.turnos.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface TurnoRepository extends JpaRepository<Turno, Long> {

    boolean existsByProfesionalIdAndFechaAndHora(
            Long profesionalId,
            LocalDate fecha,
            LocalTime hora);


    List<Turno> findByProfesionalId(Long profesionalId);

    List<Turno> findByPacienteId(Long pacienteId);
}
