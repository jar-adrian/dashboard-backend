package com.estadistica.dashboard.controller;

import com.estadistica.dashboard.model.EstadoAlumno;
import com.estadistica.dashboard.service.EstadisticasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/estadisticas")
@CrossOrigin(origins = "*") // permite llamadas desde cualquier origen (útil para el frontend)
public class EstadisticasController {
    
    private final EstadisticasService estadisticasService;
    
    @Autowired
    public EstadisticasController(EstadisticasService estadisticasService) {
        this.estadisticasService = estadisticasService;
    }
    
    // GET: obtener cantidad de encuestas por estado (aprobado, desaprobado, desertor)
    @GetMapping("/por-estado")
    public Map<EstadoAlumno, Long> obtenerCantidadPorEstado() {
        return estadisticasService.contarPorEstado();
    }
}