package com.estadistica.dashboard.controller;

import com.estadistica.dashboard.model.Encuesta;
import com.estadistica.dashboard.service.EncuestaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/encuestas")
@CrossOrigin(origins = "*") // Permitir peticiones desde cualquier origen
public class EncuestaController {
    
    private final EncuestaService encuestaService;
    
    @Autowired
    public EncuestaController(EncuestaService encuestaService) {
        this.encuestaService = encuestaService;
    }
    
    // POST: Guardar una encuesta
    @PostMapping
    public Encuesta guardarEncuesta(@Valid @RequestBody Encuesta encuesta) {
        return encuestaService.guardarEncuesta(encuesta);
    }
    
    // GET: Obtener todas las encuestas
    @GetMapping
    public List<Encuesta> obtenerTodas() {
        return encuestaService.obtenerTodas();
    }
}