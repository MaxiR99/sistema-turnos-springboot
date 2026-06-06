package com.todocode.practice.turnos.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TurnoResponseDTO {


    private Long id;
    private LocalDate fecha;
    private LocalTime hora;

    private String pacienteNombre;
    private String profesionalNombre;
}
