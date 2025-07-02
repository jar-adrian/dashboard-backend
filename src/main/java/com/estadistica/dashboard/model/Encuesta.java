package com.estadistica.dashboard.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "encuestas")
public class Encuesta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "El estado no puede ser nulo")
    @Enumerated(EnumType.STRING)
    private Estado estado;
    
    @NotNull(message = "El motivo es obligatorio")
    @Size(min = 3, max = 100, message = "El motivo debe tener entre 3 y 100 caracteres")
    private String motivo;
    
    // Constructor vacío requerido por JPA
    public Encuesta() {
    }
    
    // Constructor útil para crear encuestas manualmente
    public Encuesta(Estado estado, String motivo) {
        this.estado = estado;
        this.motivo = motivo;
    }
    
    // Getters y Setters
    
    public Long getId() {
        return id;
    }
    
    public Estado getEstado() {
        return estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public String getMotivo() {
        return motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    // Enum para el campo estado
    public enum Estado {
        APROBADO,
        DESAPROBADO,
        DESERTOR
    }
}