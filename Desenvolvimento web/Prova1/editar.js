const botaoCancelar = document.getElementById("btn-cancelar");
const botaoSalvar = document.getElementById("btn-salvar");
const botaoAtualizar = document.getElementById("btn-salvar");

const campoNome = document.getElementById("exampleInputname1");
const campoEmail = document.getElementById("exampleInputEmail1");
const campoTelefone = document.getElementById("exampleInputtelefone1");
const campoEndereco = document.getElementById("exampleInputendereco1");
const campoAtivo = document.getElementById("exampleCheck1");

const preencherFormulario = (pessoa) => {
  campoNome.value = pessoa.nome;
  campoEmail.value = pessoa.email;
  campoTelefone.value = pessoa.telefone;
  campoEndereco.value = pessoa.endereco;
  campoAtivo.value = pessoa.ativo;
};

const urlParams = new URLSearchParams(window.location.search);
const idPessoa = urlParams.get("id");

if (idPessoa) {
  fetch(`http://localhost:8080/pessoas/${idPessoa}`, {
    method: "GET",
    headers: {
      "Content-Type": "application/json",
    },
  })
    .then((response) => response.json())
    .then((pessoa) => {
      console.log("Dados da pessoa obtidos:", pessoa);
      preencherFormulario(pessoa);
    })
    .catch((error) => {
      console.error("Erro ao obter os dados da pessoa:", error);
    });
}

botaoCancelar.addEventListener("click", (event) => {
  event.preventDefault();

  campoNome.value = "";
  campoEmail.value = "";
  campoTelefone.value = "";
  campoEndereco.value = "";
});

botaoAtualizar.addEventListener("click", (event) => {
  event.preventDefault();

  const pessoaAtualizada = {
    nome: campoNome.value,
    email: campoEmail.value,
    telefone: campoTelefone.value,
    endereco: campoEndereco.value,
  };

  fetch(`http://localhost:8080/pessoas/${idPessoa}`, {
    method: "PUT",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(pessoaAtualizada),
  })
    .then((response) => {
      if (!response.ok) {
        throw new Error("Erro ao atualizar os dados da pessoa");
      }
      return response.json();
    })
    .then((pessoa) => {
      console.log("Dados da pessoa atualizados:", pessoa);
      window.location.href = "index.html";
    })
    .catch((error) => {
      console.error("Erro ao atualizar os dados da pessoa:", error);
    });
});
