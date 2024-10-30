package com.example.carro.controllers;

import com.example.carro.entity.Carro;
import com.example.carro.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/carros")
@RequiredArgsConstructor
public class CarroController {

    private final CarroRepository repository;

    @GetMapping
    public List<Carro> buscarTodosCarros() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Carro> buscarCarro(@PathVariable(name = "id") Long codigo) {
        return repository.findById(codigo);
    }

    @PostMapping
    public Carro salvarNovoCarro(@RequestBody Carro novoCarro) {
        novoCarro.setId(null);
        return repository.save(novoCarro);
    }

    @DeleteMapping("/{id}")
    public void deletarCarro(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizarCarro(@PathVariable Long id, @RequestBody Carro carro) {
        carro.setId(id);
        repository.save(carro);
    }

}
