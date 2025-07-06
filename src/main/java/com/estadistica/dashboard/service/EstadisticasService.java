package com.estadistica.dashboard.service;

import com.estadistica.dashboard.model.Encuesta;
import com.estadistica.dashboard.model.EstadoAlumno;
import com.estadistica.dashboard.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Service
public class EstadisticasService {
    
    private final EncuestaRepository encuestaRepository;
    
    @Autowired
    public EstadisticasService(EncuestaRepository encuestaRepository) {
        this.encuestaRepository = encuestaRepository;
    }
    
    // Devuelve la cantidad de encuestas por estado
    public Map<EstadoAlumno, Long> contarPorEstado() {
        List<Encuesta> encuestas = encuestaRepository.findAll();
        Map<EstadoAlumno, Long> conteo = new EnumMap<>(EstadoAlumno.class);
        
        // Inicializamos el mapa con 0s
        for (EstadoAlumno estado : EstadoAlumno.values()) {
            conteo.put(estado, 0L);
        }
        
        // Contamos cada estado
        for (Encuesta encuesta : encuestas) {
            EstadoAlumno estado = encuesta.getEstado();
            conteo.put(estado, conteo.get(estado) + 1);
        }
        
        return conteo;
    }
}