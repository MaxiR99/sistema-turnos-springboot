package com.todocode.practice.turnos.service;

import com.todocode.practice.turnos.model.Paciente;
import com.todocode.practice.turnos.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImp implements PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteServiceImp(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
}

@Override
public Paciente crearPaciente(Paciente paciente) {
    return pacienteRepository.save(paciente);
    }

    @Override
    public List<Paciente> listarPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente buscarPaciente(Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }
}
