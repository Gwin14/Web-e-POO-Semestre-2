package com.example.pessoaapi.controller;

import com.example.pessoaapi.entity.Pessoa;
import com.example.pessoaapi.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaRepository repository;

    @CrossOrigin(origins = {"http://127.0.0.1:5500", "http://127.0.0.1:8080", "http://127.0.0.1:8000"})
    @GetMapping
    public ResponseEntity<List<Pessoa>> buscarTodasPessoas() {
        List<Pessoa> pessoas = repository.findAll();
        return ResponseEntity.ok(pessoas);
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5500", "http://127.0.0.1:8080", "http://127.0.0.1:8000"})
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarPessoa(@PathVariable Long id) {
        Optional<Pessoa> pessoa = repository.findById(id);
        if (pessoa.isPresent()) {
            return ResponseEntity.ok(pessoa.get());
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Pessoa com ID " + id + " não encontrada");
        }
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5500", "http://127.0.0.1:8080", "http://127.0.0.1:8000"})
    @PostMapping
    public ResponseEntity<Pessoa> salvarNovaPessoa(@RequestBody Pessoa novaPessoa) {
        Pessoa pessoaSalva = repository.save(novaPessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSalva);
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5500", "http://127.0.0.1:8080", "http://127.0.0.1:8000"})
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarPessoa(@PathVariable Long id) {
        Optional<Pessoa> pessoaExistente = repository.findById(id);
        if (pessoaExistente.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok("Pessoa com ID " + id + " deletada com sucesso");
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Pessoa com ID " + id + " não encontrada");
        }
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5500", "http://127.0.0.1:8080", "http://127.0.0.1:8000"})
    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        Optional<Pessoa> pessoaExistente = repository.findById(id);
        if (pessoaExistente.isPresent()) {
            pessoa.setId(id);
            Pessoa pessoaAtualizada = repository.save(pessoa);
            return ResponseEntity.ok(pessoaAtualizada);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Pessoa com ID " + id + " não encontrada");
        }
    }

}
