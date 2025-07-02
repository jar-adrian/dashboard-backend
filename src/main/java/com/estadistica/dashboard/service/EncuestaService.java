package com.estadistica.dashboard.service;

import com.estadistica.dashboard.model.Encuesta;
import com.estadistica.dashboard.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EncuestaService {
    
    private final EncuestaRepository encuestaRepository;
    
    @Autowired
    public EncuestaService(EncuestaRepository encuestaRepository) {
        this.encuestaRepository = encuestaRepository;
    }
    
    // Guardar una encuesta
    public Encuesta guardarEncuesta(Encuesta encuesta) {
        return encuestaRepository.save(encuesta);
    }
    
    // Obtener todas las encuestas
    public List<Encuesta> obtenerTodas() {
        return encuestaRepository.findAll();
    }
    
    // Buscar por ID (opcional, útil si querés detalles o editar)
    public Optional<Encuesta> buscarPorId(Long id) {
        return encuestaRepository.findById(id);
    }
    
    // Eliminar una encuesta por ID (por si hacés un panel de administración)
    public void eliminarPorId(Long id) {
        encuestaRepository.deleteById(id);
    }
}