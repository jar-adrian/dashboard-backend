package com.estadistica.dashboard.repository;

import com.estadistica.dashboard.model.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Long> {
    // Se puede agregar métodos personalizados, buscar por estado, etc.
}
