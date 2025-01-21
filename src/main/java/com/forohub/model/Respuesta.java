package com.forohub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 5, max = 1000)
    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @NotNull
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    private Boolean solucion = false;

    // Getters y Setters
    // Constructor vacío
    public Respuesta() {}

    public Respuesta(String mensaje, Topico topico, Usuario autor, Boolean solucion) {
        this.mensaje = mensaje;
        this.topico = topico;
        this.autor = autor;
        this.solucion = solucion;
    }
}
