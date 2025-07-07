package com.estadistica.dashboard.service;

import com.estadistica.dashboard.dto.EstadisticasDTO;
import com.estadistica.dashboard.model.EstadoAlumno;
import com.estadistica.dashboard.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadisticasService {
    
    private final EncuestaRepository encuestaRepository;
    
    @Autowired
    public EstadisticasService(EncuestaRepository encuestaRepository) {
        this.encuestaRepository = encuestaRepository;
    }
    
    public EstadisticasDTO obtenerEstadisticasPorEstado() {
        List<Object[]> resultados = encuestaRepository.contarEncuestasPorEstado();
        
        int aprobados = 0;
        int desaprobados = 0;
        int desertores = 0;
        
        for (Object[] fila : resultados) {
            EstadoAlumno estado = (EstadoAlumno) fila[0];
            Long cantidad = (Long) fila[1];
            
            switch (estado) {
                case APROBADO -> aprobados = cantidad.intValue();
                case DESAPROBADO -> desaprobados = cantidad.intValue();
                case DESERTOR -> desertores = cantidad.intValue();
            }
        }
        
        return new EstadisticasDTO(aprobados, desaprobados, desertores);
    }
}