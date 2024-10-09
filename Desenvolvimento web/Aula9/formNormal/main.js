function somar() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;
    const resultado = document.getElementById("resultado");

    if (num1 === "" || num2 === "") {
        alert("Devem ser inseridos os números.");
    } else {
        resultado.innerHTML = parseFloat(num1) + parseFloat(num2);
    }
}
