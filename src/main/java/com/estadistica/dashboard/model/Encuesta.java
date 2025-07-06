package com.estadistica.dashboard.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Encuesta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "El estado del alumno es obligatorio")
    @Enumerated(EnumType.STRING)
    private EstadoAlumno estado;
    
    @NotNull(message = "El motivo no puede ser nulo")
    @Size(min = 5, max = 100, message = "El motivo debe tener entre 5 y 100 caracteres")
    private String motivo;
    
    // Constructor vacío obligatorio para JPA
    public Encuesta() {}
    
    public Encuesta(EstadoAlumno estado, String motivo) {
        this.estado = estado;
        this.motivo = motivo;
    }
    
    public Long getId() {
        return id;
    }
    
    public EstadoAlumno getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoAlumno estado) {
        this.estado = estado;
    }
    
    public String getMotivo() {
        return motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}