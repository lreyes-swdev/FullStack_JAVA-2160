let elemento = document.getElementById("principal");

/*Funciones */
const suma = () => {
    elemento.innerHTML = 58 + 23;
}

suma();

const sumar = (a=0, b=0) => {
    elemento.innerHTML += `<p>${a+b}</p>`;
}

sumar(5,89);
sumar(9,89);
sumar(5,9);
sumar(56);
sumar();

function Persona(nombre, apellido, edad, dni) {
    this.edad = edad;
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
}

let Luis = new Persona("Luis", "Navas", 48, 9565821);
let Pedro = new Persona("Pedro", "Ortega", 25, 6525635);
console.log(Luis);
console.log(Pedro);

elemento.innerHTML += `<p>Nombre: ${Luis.nombre} | Apellido: ${Luis.apellido} | Edad: ${Luis.edad}</p>`;