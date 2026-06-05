package com.todocode.practice.turnos.repository;


import com.todocode.practice.turnos.model.Profesional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesionalRepository extends JpaRepository<Profesional, Long> {
}
