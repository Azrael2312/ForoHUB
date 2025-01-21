package com.forohub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nombre;

    private String categoria;

    // Getters y Setters
    // Constructor vacío
    public Curso() {}

    public Curso(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
}
