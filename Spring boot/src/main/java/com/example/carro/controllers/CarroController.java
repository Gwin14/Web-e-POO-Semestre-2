package com.example.carro.controllers;

import com.example.carro.entity.Carro;
import com.example.carro.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "<http://exemplo.com>")
@RestController
@RequestMapping("/carros")
@RequiredArgsConstructor
public class CarroController {

    private final CarroRepository repository;

    @GetMapping
    public ResponseEntity<List<Carro>> buscarTodosCarros() {
        List<Carro> carros = repository.findAll();
        return ResponseEntity.ok(carros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarCarro(@PathVariable Long id) {
        Optional<Carro> carro = repository.findById(id);
        if (carro.isPresent()) {
            return ResponseEntity.ok(carro.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Carro com ID " + id + " não encontrado.");
        }
    }

    @PostMapping
    public ResponseEntity<Carro> salvarNovoCarro(@RequestBody Carro novoCarro) {
        novoCarro.setId(null);
        Carro carroSalvo = repository.save(novoCarro);
        return ResponseEntity.status(HttpStatus.CREATED).body(carroSalvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarCarro(@PathVariable Long id) {
        Optional<Carro> carroExistente = repository.findById(id);
        if (carroExistente.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok("Carro com ID " + id + " deletado com sucesso.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Carro com ID " + id + " não encontrado.");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarCarro(@PathVariable Long id, @RequestBody Carro carro) {
        Optional<Carro> carroExistente = repository.findById(id);
        if (carroExistente.isPresent()) {
            carro.setId(id);
            Carro carroAtualizado = repository.save(carro);
            return ResponseEntity.ok(carroAtualizado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Carro com ID " + id + " não encontrado.");
        }
    }
}
