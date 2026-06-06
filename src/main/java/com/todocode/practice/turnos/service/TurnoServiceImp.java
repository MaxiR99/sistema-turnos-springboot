package com.todocode.practice.turnos.service;

import com.todocode.practice.turnos.model.Turno;
import com.todocode.practice.turnos.repository.TurnoRepository;
import com.todocode.practice.turnos.service.TurnoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoServiceImp implements  TurnoService{

    private final TurnoRepository turnoRepository;

    public TurnoServiceImp(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }


    @Override
    public Turno crearTurno(Turno turno) {

        if (turnoRepository.existsByProfesionalIdAndFechaAndHora(
                turno.getProfesional().getId(),
                turno.getFecha(),
                turno.getHora())) {

            throw new RuntimeException(
                    "El profesional ya tiene un turno en ese horario");
        }
        return turnoRepository.save(turno);
    }

    @Override
    public List<Turno> listarTurnos() {
        return turnoRepository.findAll();
    }

    @Override
    public Turno buscarTurno(Long id) {
        return turnoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarTurno(Long id) {
        turnoRepository.deleteById(id);
    }

    @Override
    public Turno actualizarTurno(Long id, Turno turno) {

        Turno turnoExistente = turnoRepository.findById(id).orElse(null);

        if (turnoExistente != null){

            turnoExistente.setFecha(turno.getFecha());
            turnoExistente.setPaciente(turno.getPaciente());
            turnoExistente.setProfesional(turno.getProfesional());

            return turnoRepository.save(turnoExistente);
        }
        return null;

    }
}
