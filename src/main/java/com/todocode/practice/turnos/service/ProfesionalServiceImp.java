package com.todocode.practice.turnos.service;
import com.todocode.practice.turnos.model.Profesional;
import com.todocode.practice.turnos.model.Profesional;
import com.todocode.practice.turnos.repository.ProfesionalRepository;
import com.todocode.practice.turnos.repository.ProfesionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class ProfesionalServiceImp implements ProfesionalService {

    private final ProfesionalRepository profesionalRepository;

    public ProfesionalServiceImp(ProfesionalRepository profesionalRepository) {
        this.profesionalRepository = profesionalRepository;
    }

    @Override
    public Profesional crearProfesional(Profesional profesional) {
        return profesionalRepository.save(profesional);
    }

    @Override
    public List<Profesional> listarProfesionales() {
        return profesionalRepository.findAll();
    }

    @Override
    public Profesional buscarProfesional(Long id) {
        return profesionalRepository.findById(id).orElse(null);
    }

    @Override
    public Profesional actualizarProfesional(Long id, Profesional profesional) {

        Profesional profesionalExistente =
                profesionalRepository.findById(id).orElse(null);

        if (profesionalExistente != null) {
            profesionalExistente.setNombre(profesional.getNombre());
            profesionalExistente.setApellido(profesional.getApellido());
            profesionalExistente.setEspecialidad(profesional.getEspecialidad());

            return profesionalRepository.save(profesionalExistente);
        }

        return null;

    }
    @Override
    public void eliminarProfesional(Long id) {
        profesionalRepository.deleteById(id);
    }
}

