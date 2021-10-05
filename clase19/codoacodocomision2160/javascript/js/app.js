// alert('Soy una ventana emergente!');
console.log('Hola soy un mensaje en la consola!');

/* Variables */
var nombre_variable;
let otra_variable = "Hola"; /* Tipo string */
const PI = 3.1416;          /* Tipo enteros y float */
let número = 2;
let hayClases = true;       /* Tipo boolean */
let terminóLaClase = false;

/* Tipos: undefined, número, String, Boolean, Objeto, arreglo, chart, función */
console.log(PI * número);
console.log(número + 8 + " " + otra_variable);

/* Condicionales */
hayClases = false;
if (hayClases == true && terminóLaClase != true) {
    console.log("Nos conectamos a la videollamada!");
} else {
    console.log("Salimos a celebrar el día del Estudiante!");
}

if (hayClases == false || terminóLaClase == true) {
    console.log("Salimos a celebrar el día del Estudiante!");
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
    //elemento.style.background = "#202020";
    //elemento.style.color = "white";
}

var _elemento;
// 2 elementos con clase 'text-center'
_elemento = document.getElementsByClassName("text-center");
console.log(_elemento);
// 1 elemento con clase 'text-center' y 'bg-info'
_elemento = document.getElementsByClassName("text-center bg-info");
console.log(_elemento);

/*
let mensaje = prompt("Introduce tu mensaje:");
elemento.innerHTML += "<h3>" + mensaje + "</h3>";
elemento.innerHTML += "<div class=\"alert alert-success\" role=\"alert\">" + mensaje + "</div>";
*/

/*
let menu = prompt("Seleccionar opción:\n 1. Opción A\n 2. Opción B\n 3. Opción C");
if(menu === '1') {
    elemento.innerHTML = "<div class=\"alert alert-success\" role=\"alert\">Se seleccionó la Opción 1</div>";
} else if(menu === '2') {
    elemento.innerHTML = "<div class=\"alert alert-warning\" role=\"alert\">Se seleccionó la Opción 2</div>";
} else if(menu === '3') {
    elemento.innerHTML = "<div class=\"alert alert-primary\" role=\"alert\">Se seleccionó la Opción 3</div>";
} else {
    elemento.innerHTML = "";
    alert("Se seleccionó una Opción fuera de rango: " + menu);
    menu = prompt("Seleccionar opción:\n 1. Opción A\n 2. Opción B\n 3. Opción C");
    // pero aquí no pasará más nada... falta alguna sentencia de bucle
}
switch(menu) {
    case '1': 
        elemento.innerHTML += "<div class=\"alert alert-success\" role=\"alert\">Se seleccionó la Opción 1</div>";
        break;
    case '2': 
        elemento.innerHTML += "<div class=\"alert alert-warning\" role=\"alert\">Se seleccionó la Opción 2</div>";
        break;
    case '3': 
        elemento.innerHTML += "<div class=\"alert alert-primary\" role=\"alert\">Se seleccionó la Opción 3</div>";
        break;
    default: 
        alert('Se seleccionó una Opción fuera de rango!');
        // pero aquí no pasará más nada... falta alguna sentencia de bucle
}
*/

/*
let num = 0, num2 = 0, resultado = "....";
num = Number(prompt("Ingresá el primer número"));
num2 = Number(prompt("Ingresá el segundo número"));
if(!isNaN(num) && !isNaN(num2)) {
    resultado = "El resultado de la suma de " + num + " y " + num2 + " es: " + (num + num2);
}
console.log(resultado);
*/

let alumnos = ["Natalia", "Nicolás", "Ramiro", "Soledad"];
//console.log(alumnos[0]);
//console.log(alumnos[alumnos.length-1]);
for(let i = 0; i < alumnos.length; ++i) {
    elemento.innerHTML += `
    <div class="card" style="width: 18rem;">
        <img class="card-img-top" src="" alt="">
        <div class="card-body">
            <h5 class="card-title"> ${alumnos[i]} </h5>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
        </div>
    </div>`;
}

alumnos.forEach( (e) => {
    elemento.innerHTML += `
    <div class="card" style="width: 18rem;">
        <img class="card-img-top" src="" alt="">
        <div class="card-body">
            <h5 class="card-title"> ${e} </h5>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
        </div>
    </div>`;
} );

alumnos.push("Bárbara");          //Agregar al final
alumnos[alumnos.length] = "Luis"; //Agregar al final

alumnos.forEach( (e, i) => {
    elemento.innerHTML += `
    <div class="card" style="width: 18rem;">
        <img class="card-img-top" src="" alt="">
        <div class="card-body">
            <h5 class="card-title"> [${i+1}] ${e} </h5>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
        </div>
    </div>`;
} );
