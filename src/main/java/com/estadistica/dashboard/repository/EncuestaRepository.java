package com.estadistica.dashboard.repository;

import com.estadistica.dashboard.model.Encuesta;
import com.estadistica.dashboard.model.EstadoAlumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EncuestaRepository extends JpaRepository<Encuesta, Long> {
    
    //creación de endpoint
    // JPQL para contar cuántas encuestas hay por cada estado
    @Query("SELECT e.estado, COUNT(e) FROM Encuesta e GROUP BY e.estado")
    //devuelve una lista de arreglos, donde cada arreglo contiene
    List<Object[]> contarEncuestasPorEstado();
    
    // Metodo automático para contar por un estado específico (lo necesita EstadisticasService)
    long countByEstado(EstadoAlumno estado);
}
