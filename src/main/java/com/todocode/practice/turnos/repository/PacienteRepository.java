package com.todocode.practice.turnos.repository;

import com.todocode.practice.turnos.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
}
