package br.com.poo.aula13;

import java.util.ArrayList;
import java.util.List;

public class Estado {

    private String sigla;
    private List<Cidade> cidades = new ArrayList<>();

    public Estado(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public void adicionarCidade(Cidade cidade) {
        this.cidades.add(cidade);
    }
}
