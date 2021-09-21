alert('Soy una ventana emergente!');
console.log('Soy un mensaje de log en la consola!');

/* Variables */
var nombre_variable;
let otra_variable = "Hola";
const PI = 3.1416;
let número = 2;
let hayClases = true;
let terminóLaClase = false;

/* Tipos: undefined, número, String, Boolean, Objeto, arreglo, chart, función */
console.log(PI * número);
console.log(número + 8 + " " + otra_variable);

/* Condicionales */
hayClases = false;
if (hayClases == true && terminóLaClase != true) {
    console.log("Nos conectamos a la videollamada!");
} else {
    console.log("Salimos a celebrar el día del estudiante!");
}

if (hayClases == false || terminóLaClase == true) {
    console.log("Salimos a celebrar el día del estudiante!");
}

let elemento = document.getElementById("principal");
console.log(elemento);
elemento.innerHTML = "Mi valor para innerHTML";
elemento.innerHTML = "<p>" + otra_variable + "</p>";
document.write("<h3 class='text-center bg-primary'>Hola buen día!</h3>");
document.write("<h3>¿Cómo están?</h3>");

if(nombre_variable == undefined) {
    elemento.innerHTML += "Evaluamos una variable sin valor definido";
    elemento.innerHTML += "<p>Luis Navas</p>";
    elemento.innerHTML += "<p>Bárbara</p>";
    elemento.innerHTML += "<p>Damián</p>";
    elemento.innerHTML += "<p>Débora</p><p>Elias</p><p>Leandro</p>";
    elemento.style.background = "#202020";
    elemento.style.color = "white";
}

var _elemento;
// 2 elementos con clase 'text-center'
_elemento = document.getElementsByClassName("text-center");
console.log(_elemento);
// 1 elemento con clase 'text-center' y 'bg-info'
_elemento = document.getElementsByClassName("text-center bg-info");
console.log(_elemento);