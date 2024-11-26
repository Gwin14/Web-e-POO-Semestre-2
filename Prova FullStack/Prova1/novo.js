const botaoCancelar = document.getElementById("btn-cancelar");
const botaoSalvar = document.getElementById("btn-salvar");

const campoNome = document.getElementById("exampleInputname1");
const campoEmail = document.getElementById("exampleInputEmail1");
const campoTelefone = document.getElementById("exampleInputtelefone1");
const campoEndereco = document.getElementById("exampleInputendereco1");

botaoSalvar.addEventListener("click", (event) => {
  event.preventDefault();

  if (
    campoNome.value === "" ||
    campoEmail.value === "" ||
    campoTelefone.value === ""
  ) {
    alert("Preencha os dados necessários!");
  } else {
    const dados = {
      id: 6,
      nome: campoNome.value,
      email: campoEmail.value,
      telefone: campoTelefone.value,
      endereco: campoEndereco.value,
      ativo: true,
    };

    fetch("http://localhost:8080/pessoas", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(dados),
    })
      .then((response) => {
        if (!response.ok) {
          throw new Error("Erro na requisição");
        }
        return response.json();
      })
      .then((data) => {
        alert("Dados salvos com sucesso!");
        window.location.href = "index.html";
      })
      .catch((error) => {
        alert("Erro ao salvar os dados: " + error.message);
      });
  }
});

botaoCancelar.addEventListener("click", (event) => {
  event.preventDefault();

  campoNome.value = "";
  campoEmail.value = "";
  campoTelefone.value = "";
  campoEndereco.value = "";
});
