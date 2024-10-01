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
    alert("Dados salvos com sucesso!");
  }
});

botaoCancelar.addEventListener("click", (event) => {
  event.preventDefault();

  campoNome.value = "";
  campoEmail.value = "";
  campoTelefone.value = "";
  campoEndereco.value = "";
});
