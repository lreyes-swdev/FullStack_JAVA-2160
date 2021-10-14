let main = document.getElementById("main");
//main.style.visibility = "hidden";

const comprarTickets = () => {
    main.innerHTML = `
        <section class="container" id="comprarTickets">
            <div class="row justify-content-center text-center mt-4">
                <div class="col-12 col-xl-7 card-group px-3">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Estudiante</h5>
                            <div class="card-text-2">
                                <p>Tienen un descuento</p>
                                <p class="fw-bold">80%</p>
                                <p class="fs-9">* presentar documentación</p>
                            </div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Trainee</h5>
                            <div class="card-text-2">
                                <p>Tienen un descuento</p>
                                <p class="fw-bold">50%</p>
                                <p class="fs-9">* presentar documentación</p>
                            </div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Junior</h5>
                            <div class="card-text-2">
                                <p>Tienen un descuento</p>
                                <p class="fw-bold">15%</p>
                                <p class="fs-9">* presentar documentación</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="col-12 col-xl-7">
                    <div class="fs-9 text-center">
                        <p class="m-0 mt-2 p-0">VENTA</p>
                        <h2 class="mb-3">VALOR DE TICKET $200</h2>
                    </div>
                    <form action="#" target="_blank" autocomplete="off">
                        <div class="row px-3">
                            <div class="col-12 col-sm-6 px-1 mb-3">
                                <input type="text" class="form-control" placeholder="Nombre"
                                    aria-label="Nombre" id="tNombre" name="tNombre" value="">
                            </div>
                            <div class="col-12 col-sm-6 px-1 mb-3">
                                <input type="text" class="form-control" placeholder="Apellido"
                                    aria-label="Apellido" id="tApellido" name="tApellido" value="">
                            </div>
                            <div class="col-12 px-1 mb-3">
                                <input type="email" class="form-control" placeholder="Correo"
                                    aria-label="Correo" id="tCorreo" name="tCorreo" value="">
                            </div>

                            <div class="col-12 col-sm-6 px-1 mb-3">
                                <p class="m-0 mb-2 p-0">Cantidad</p>
                                <input type="text" class="form-control" placeholder="Cantidad"
                                    aria-label="Cantidad" id="tCantidad" name="tCantidad" value="">
                            </div>
                            <div class="col-12 col-sm-6 px-1 mb-3">
                                <label for="inputState" class="m-0 mb-2 p-0">Categoría</label>
                                <select class="form-select" id="inputState" name="inputState">
                                    <option value="estudiante" selected>Estudiante</option>
                                    <option value="trainee">Trainee</option>
                                    <option value="junior">Junior</option>
                                </select>
                            </div>

                            <div class="col-12 px-1 my-3">
                                <div class="alert alert-primary" role="alert" id="totalCompra">
                                    Total a Pagar: $
                                </div>
                            </div>
                            
                            <div class="col-12 col-sm-6 px-1 mb-3">
                                <button type="reset" class="btn btn-enviar w-100">Borrar</button>
                            </div>
                            <div class="col-12 col-sm-6 px-1 mb-3">
                                <button type="button" id="botonCalcular" class="btn btn-enviar w-100">Resumen</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>
        `;
};