package com.estadistica.dashboard.dto;

public class EstadisticasDTO {
    private int aprobados;
    private int desaprobados;
    private int desertores;
    
    public EstadisticasDTO(int aprobados, int desaprobados, int desertores) {
        this.aprobados = aprobados;
        this.desaprobados = desaprobados;
        this.desertores = desertores;
    }
    
    public int getAprobados() {
        return aprobados;
    }
    
    public int getDesaprobados() {
        return desaprobados;
    }
    
    public int getDesertores() {
        return desertores;
    }
}