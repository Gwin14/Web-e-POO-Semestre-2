const botaoEditar = document.querySelectorAll(".edit");
const botaoDeletar = document.querySelectorAll(".delete");

botaoDeletar.forEach((element) => {
    element.addEventListener("click", (event) => {
        event.preventDefault();

        let resposta = confirm("Deseja remover esse registro?");

        if (resposta) {
            const elementoPai1 = element.parentElement.parentElement;
            const elementoPai2 = elementoPai1.parentElement;

            elementoPai2.style.display = "none";
        }
    });
});
