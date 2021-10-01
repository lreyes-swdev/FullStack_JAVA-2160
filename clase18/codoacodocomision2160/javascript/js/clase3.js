/* Funciones */
function calcular() {
    let num = Number(prompt("Ingrese el primer número"));
    let num2 = Number(prompt("Ingrese el segundo número"));
    let op = prompt("Elija el tipo de operación: \n" +
        " + Para sumar \n" +
        " - Para restar\n" +
        " * Para multiplicar\n" +
        " / Para dividir");
    let resultado = 0;
    let elemento = document.getElementById("principal");

    if (op === "+") {
        resultado = num + num2;
        elemento.innerHTML += "<p> El resultado de la suma de " + num + " y " + num2 + " es: " +
            resultado + "</p>";
    } else if (op === "-") {
        resultado = num - num2;
        elemento.innerHTML += "<p> El resultado de la resta de " + num + " y " + num2 + " es: " +
            resultado + "</p>";
    } else if (op === "/") {
        resultado = num / num2;
        elemento.innerHTML += "<p> El resultado de la división de " + num + " y " + num2 + " es: " +
            resultado + "</p>";
    } else if (op === "*") {
        resultado = num * num2;
        elemento.innerHTML += "<p> El resultado de la multiplicación de " + num + " y " + num2 + " es: " +
            resultado + "</p>";
    } else {
        elemento.innerHTML += "<p> El valor para la operación es incorrecto!</p>";
    }
}