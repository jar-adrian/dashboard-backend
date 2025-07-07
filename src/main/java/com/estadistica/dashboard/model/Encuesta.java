package com.estadistica.dashboard.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Encuesta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private EstadoAlumno estado;
    
    private String motivo;
    
    private String materia;
    
    private String claridad;
    
    @Column(length = 1000)
    private String comentarios;
    
    // Getters y Setters
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
    
    public String getMateria() {
        return materia;
    }
    
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String getClaridad() {
        return claridad;
    }
    
    public void setClaridad(String claridad) {
        this.claridad = claridad;
    }
    
    public String getComentarios() {
        return comentarios;
    }
    
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}