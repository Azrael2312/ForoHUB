package com.forohub.controller;

import com.forohub.model.Topico;
import com.forohub.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public List<Topico> listar() {
        return topicoService.listar();
    }

    @GetMapping("/{id}")
    public Topico obtener(@PathVariable Long id) {
        return topicoService.obtenerPorId(id);
    }

    @PostMapping
    public Topico crear(@RequestBody @Valid Topico topico) {
        return topicoService.crear(topico);
    }

    @PutMapping("/{id}")
    public Topico actualizar(@PathVariable Long id, @RequestBody @Valid Topico topico) {
        return topicoService.actualizar(id, topico);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        topicoService.eliminar(id);
    }
}
