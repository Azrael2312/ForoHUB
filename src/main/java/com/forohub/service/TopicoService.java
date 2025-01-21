package com.forohub.service;

import com.forohub.model.Topico;
import com.forohub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> listar() {
        return topicoRepository.findAll();
    }

    public Topico obtenerPorId(Long id) {
        return topicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tópico no encontrado"));
    }

    public Topico crear(Topico topico) {
        return topicoRepository.save(topico);
    }

    public Topico actualizar(Long id, Topico datosActualizados) {
        Topico topico = obtenerPorId(id);
        topico.setTitulo(datosActualizados.getTitulo());
        topico.setMensaje(datosActualizados.getMensaje());
        topico.setStatus(datosActualizados.getStatus());
        return topicoRepository.save(topico);
    }

    public void eliminar(Long id) {
        topicoRepository.deleteById(id);
    }
}
