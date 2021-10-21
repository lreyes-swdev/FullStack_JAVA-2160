/* Arreglos */
let elemento = document.querySelector("#principal");

let mascotas = [];
/*
mascotas[1]="Loro";
mascotas[0]="Perro";
mascotas.push("Gallo");
mascotas.forEach( m => {
    elemento.innerHTML += `<h2>${m}</h2>`;
});
*/

const agregarDatos = () => {
    let datos = document.querySelectorAll("input");
    console.log(datos);
    console.log(datos[0]);
    console.log(datos[0].value);

    let consulta = "";
    if(datos[7].checked) {
        consulta = "Consulta";
    } else {
        consulta = "Urgencia";
    }

    /* object{propietario, nombre, especie, raza, edad, peso, imagen, tipoConsulta} */
    let mascota = {
        propietario: datos[0].value,
        nombre: datos[1].value,
        especie: datos[2].value,
        raza: datos[3].value,
        edad: datos[4].value,
        peso: datos[5].value,
        imagen: datos[6].value, // https://cutt.ly/WEXyWFA
        //tipoConsulta: consulta
        tipoConsulta: datos[7].checked? "Consulta" : "Urgencia"
    };

    return mascota;
}

const agregarMascota = () => {
    mascotas.push(agregarDatos());
    console.log(mascotas);
    mostrarMascotas();
}

/* ECMAScript 5 (ES5)*/
//function crearForm() {}

/* ECMAScript 6 (ES6)*/
const crearForm = () => {
    elemento.innerHTML = `
        <form class="col-6">
            <div class="mb-3">
                <label for="propietario" class="form-label">Propietario</label>
                <input type="text" class="form-control" id="propietario">
            </div>
            <div class="mb-3">
                <label for="nombre" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="nombre">
            </div>
            <div class="mb-3">
                <label for="especie" class="form-label">Especie</label>
                <input type="text" class="form-control" id="especie">
            </div>
            <div class="mb-3">
                <label for="raza" class="form-label">Raza</label>
                <input type="text" class="form-control" id="raza">
            </div>
            <div class="mb-3">
                <label for="edad" class="form-label">Edad</label>
                <input type="text" class="form-control" id="edad">
            </div>
            <div class="mb-3">
                <label for="peso" class="form-label">Peso</label>
                <input type="text" class="form-control" id="peso">
            </div>
            <div class="mb-3">
                <label for="imagen" class="form-label">Imagen</label>
                <input type="text" class="form-control" id="imagen">
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                <label class="form-check-label" for="flexRadioDefault1">
                    Consulta
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                <label class="form-check-label" for="flexRadioDefault2">
                    Urgencia
                </label>
            </div>
            <button type="button" id="btn" class="btn btn-primary">Agregar Datos</button>
        </form>
        `;
    document.getElementById("btn").addEventListener("click", agregarMascota);
}
crearForm();

const actualizarM = (a) => {
    mascotas[a] = agregarDatos();
    mostrarMascotas();
}

const modificarM = (k) => {
    let mascota = mascotas[k];
    console.log(mascota);
    elemento.innerHTML = `
    <form class="col-6">
        <div class="mb-3">
            <label for="propietario" class="form-label">Propietario</label>
            <input type="text" class="form-control" id="propietario" value="${mascota.propietario}">
        </div>
        <div class="mb-3">
            <label for="nombre" class="form-label">Nombre</label>
            <input type="text" class="form-control" id="nombre" value="${mascota.nombre}">
        </div>
        <div class="mb-3">
            <label for="especie" class="form-label">Especie</label>
            <input type="text" class="form-control" id="especie" value="${mascota.especie}">
        </div>
        <div class="mb-3">
            <label for="raza" class="form-label">Raza</label>
            <input type="text" class="form-control" id="raza" value="${mascota.raza}">
        </div>
        <div class="mb-3">
            <label for="edad" class="form-label">Edad</label>
            <input type="text" class="form-control" id="edad" value="${mascota.edad}">
        </div>
        <div class="mb-3">
            <label for="peso" class="form-label">Peso</label>
            <input type="text" class="form-control" id="peso" value="${mascota.peso}">
        </div>
        <div class="mb-3">
            <label for="imagen" class="form-label">Imagen</label>
            <input type="text" class="form-control" id="imagen" value="${mascota.imagen}">
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
            <label class="form-check-label" for="flexRadioDefault1">
                Consulta
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
            <label class="form-check-label" for="flexRadioDefault2">
                Urgencia
            </label>
        </div>
        <button type="button" onclick="actualizarM(${k})" class="btn btn-primary">Modificar Datos</button>
    </form>
    `;
}

const eliminarM = (z) => {
    mascotas.splice(z, 1);
    mostrarMascotas();
}

const mostrarMascotas = () => {
    elemento.innerHTML="";
    mascotas.forEach( (m, index) => {
        elemento.innerHTML += `
            <div class="col-12">
                <div class="card" style="width: 18rem;">
                    <img src="${m.imagen}" class="card-img-top" alt="${m.nombre}">
                    <div class="card-body">
                        <h5 class="card-title">Nombre: ${m.nombre}</h5>
                        <p class="card-text">Especie: ${m.especie}</p>
                        <p class="card-text">Raza: ${m.raza}</p>
                        <p class="card-text">Edad: ${m.edad}</p>
                        <p class="card-text">Peso: ${m.peso}</p>
                        <p class="card-text">Tipo de Consulta: ${m.tipoConsulta}</p>
                        <p class="card-text">Propietario: ${m.propietario}</p>
                        <a href="#" class="btn btn-primary" onclick="crearForm()">Agregar otra Mascota</a>
                        <a href="#" class="btn btn-primary" onclick="modificarM(${index})">Modificar</a>
                        <a href="#" class="btn btn-primary" onclick="eliminarM(${index})">Eliminar</a>
                        </div>
                </div>
            </div>
            `;
    });
}

let números = [78, 35, 65];
console.log(números.indexOf(35));

números[números.indexOf(35)] = 99;
console.log(números.indexOf(35));
console.log(números.indexOf(99));

console.log(números);
console.log(números.length);
números.splice(1, 1);
console.log(números.length);
console.log(números);