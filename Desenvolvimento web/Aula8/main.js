// function somar(valor1, valor2) {
//   if (valor1 > 5) {
//     valor1++;
//   } else {
//     valor2 = 4;
//   }

//   alert("javascrepete");
//   alert("Valor: " + (valor1 + valor2));
// }

// const titulo = document.getElementById("titulo");
// const num = 1;

// setInterval(() => {
//   titulo.innerHTML += `<span class='texto'
//   style="animation: groe 1s linear infinite;
//   animation-delay: 3s;
//    ">e</span>`;
//   num += 0.2;
// }, 100);

const elementoInput1 = document.getElementById("numero1");
const elementoInput2 = document.getElementById("numero2");
const btnSomar = document.getElementById("btnSomar");
const resultado = document.getElementById("resultado");

function somar() {
    const numero1 = parseFloat(elementoInput1.value);
    const numero2 = parseFloat(elementoInput2.value);

    resultado.textContent = numero1 + numero2;
    resultado.style.opacity = 1;
    resultado.style.fontSize = "6em";
}

function sumir() {
    const container = document.querySelector(".container");

    container.style.opacity = 0;
}
