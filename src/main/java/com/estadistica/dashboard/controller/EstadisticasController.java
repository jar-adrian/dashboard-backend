package com.estadistica.dashboard.controller;

import com.estadistica.dashboard.dto.EstadisticasDTO;
import com.estadistica.dashboard.service.EstadisticasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estadisticas")
@CrossOrigin(origins = "*") // Permite recibir solicitudes desde cualquier origen
public class EstadisticasController {
    
    private final EstadisticasService estadisticasService;
    
    @Autowired
    public EstadisticasController(EstadisticasService estadisticasService) {
        this.estadisticasService = estadisticasService;
    }
    
    // GET: Devuelve las estadísticas resumidas de encuestas por estado
    @GetMapping("/estado")
    public EstadisticasDTO obtenerEstadisticasPorEstado() {
        return estadisticasService.obtenerEstadisticasPorEstado();
    }
}