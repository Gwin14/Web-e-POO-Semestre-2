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
    @ResponseBody
    public List<Carro> buscarTodosCarros() {

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro(1L, "Ford", "Focus", 2010));
        carros.add(new Carro(2L, "GM", "Corsa", 2010));
        carros.add(new Carro(3L, "Fiat", "Uno", 2010));

        return carros;
    }

    @PostMapping
    @ResponseBody
    public Carro salvarNovoCarro(@RequestBody Carro novoCarro) {

        novoCarro.setId(new Random().nextLong(50));

        return novoCarro;
    }
}
