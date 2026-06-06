package com.todocode.practice.turnos.controller;



import com.todocode.practice.turnos.model.Turno;
import com.todocode.practice.turnos.service.TurnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private final TurnoService turnoService;

    public TurnoController(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @PostMapping
    public Turno crearTurno(@RequestBody Turno turno) {
        return turnoService.crearTurno(turno);
    }

    @GetMapping
    public List<Turno> listarTurnos() {
        return turnoService.listarTurnos();
    }

    @GetMapping("/{id}")
    public Turno buscarTurno(@PathVariable Long id) {
        return turnoService.buscarTurno(id);
    }

    @DeleteMapping("/{id}")
    public void  eliminarTurno(@PathVariable Long id) {
        turnoService.eliminarTurno(id);
    }

    @PutMapping("/{id}")
    public Turno actualizarTurno(@PathVariable Long id,
                                 @RequestBody Turno turno){
        return turnoService.actualizarTurno(id, turno);
    }
}
