package br.com.poo.aula13;

public class Endereco {

    private String logradouro;
    private Cidade cidade;

    public Endereco(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                '}';
    }
}
