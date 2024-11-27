const tabela = document.getElementById("tabela");

fetch("http://localhost:8080/pessoas", {
  method: "GET",
  headers: {
    "Content-Type": "application/json",
  },
})
  .then((response) => response.json())
  .then((data) => {
    console.log("Dados obtidos com sucesso:", data);
    tabela.innerHTML = `
    <thead>
      <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Ativo</th>
        <th>Email</th>
        <th>Telefone</th>
        <th>Endereço</th>
        <th>Ações</th>
      </tr>
    </thead>
    <tbody>
  `;
    data.forEach((pessoa) => {
      tabela.innerHTML += `
      <tr>
      <td>${pessoa.ativo ? "Sim" : "Não"}</td>
      <td>${pessoa.id}</td>
        <td>${pessoa.nome}</td>
        <td>${pessoa.email}</td>
        <td>${pessoa.telefone}</td>
        <td>${pessoa.endereco}</td>

        <td>
          <button class="edit btn btn-primary" onclick="window.location.href='editar.html?id=${
            pessoa.id
          }'"><i class="fas fa-edit fa-1x"></i></button>
          <button class="delete btn btn-danger" onclick="deletarPessoa(${
            pessoa.id
          })"><i class="fas fa-trash fa-1x"></i></button>
        </td>
      </tr>
    `;
    });
  })
  .catch((error) => {
    console.error("Erro ao obter os dados:", error);
  });

function deletarPessoa(id) {
  fetch(`http://localhost:8080/pessoas/${id}`, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
  })
    .then((response) => {
      if (response.ok) {
        alert("Pessoa deletada com sucesso");
        location.reload();
      } else {
        console.error("Erro ao deletar a pessoa:", response.statusText);
      }
    })
    .catch((error) => {
      console.error("Erro ao realizar a requisição de deletar:", error);
    });
}
