const pesquisar = document.getElementById("pesquisar");
const limpar = document.getElementById("limpar");

limpar.addEventListener("click", (event) => {
    event.preventDefault();

    const inputs = document.querySelectorAll(".input-dados");

    inputs.forEach((element) => {
        element.value = "";
    });
});

pesquisar.addEventListener("click", (event) => {
    event.preventDefault();

    const cep = document.querySelector("#cep").value;

    const url = "https://viacep.com.br/ws/" + cep + "/json/";

    fetch(url)
        .then((resposta) => resposta.json())
        .then((objeto) => {
            preencherCampos(objeto);
        })
        .catch((erro) => {
            console.error(erro);
        });
});

function preencherCampos(dados) {
    console.log(dados);
    document.getElementById("rua").value = dados.logradouro;
    document.getElementById("complemento").value = dados.complemento;
    document.getElementById("bairro").value = dados.bairro;
    document.getElementById("cidade").value = dados.localidade;
    document.getElementById("estado").value = dados.uf;
}
