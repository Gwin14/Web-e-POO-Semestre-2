package com.example.carro.controllers;

import com.example.carro.entity.Carro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @GetMapping
    public List<Carro> buscarTodosCarros() {

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro(1L, "Ford", "Focus", 2010));
        carros.add(new Carro(2L, "GM", "Corsa", 2010));
        carros.add(new Carro(3L, "Fiat", "Uno", 2010));

        return carros;
    }

    @GetMapping("/{id}")
    public Carro buscarCarro(@PathVariable(name = "id") Long codigo) {
        return new Carro(1L, "Ford", "Focus", 2010);
    }

    @DeleteMapping("/{id}")
    public String deletarCarro(@PathVariable Long id) {
        return "Carro " + id + " deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public void atualizarCarro(@PathVariable Long id, @RequestBody Carro carro) {

        Carro carroBancoDados = this.buscarCarroBancoDados(id);

        if (carroBancoDados != null) {
            carroBancoDados.setMarca(carro.getMarca());
            carroBancoDados.setModelo(carro.getModelo());
            carroBancoDados.setAnoFabricacao(carro.getAnoFabricacao());

            this.salvarBancoDados(carroBancoDados);
            System.out.println(carro.toString());
            System.out.println("Atualizado com sucesso: " + id);
        }
    }

    @PostMapping
    public Carro salvarNovoCarro(@RequestBody Carro novoCarro) {
        novoCarro.setId(new Random().nextLong(50));

        return novoCarro;
    }

    private void salvarBancoDados(Carro novoCarro) {
        // Simulação de salvar no banco de dados
        System.out.println("Carro salvo com sucesso: " + novoCarro.toString());
    }

    private Carro buscarCarroBancoDados(Long id) {
        return new Carro(id, "Ford", "nhe", 2010);
    }
}
