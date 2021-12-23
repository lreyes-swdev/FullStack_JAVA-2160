<%@page import="modelo.Oradores"%>
<%@page import="modelo.OradoresDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Orador</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <%
            int _id = Integer.parseInt(request.getParameter("id"));
            OradoresDAO oradoresDAO = new OradoresDAO();
            Oradores orador = oradoresDAO.mostrarOrador(_id);
        %>
        <div class="container">
            <div class="row justify-content-center mb-3">
                <div class="col-12 col-md-10">
                    <div class="fs-7 text-center">
                        <p class="m-0 mt-2 p-0">MODIFICAR DATOS</p>
                        <h3>ORADOR</h3>
                        <p class="m-0 fs-9 my-2 p-0">Anótate como orador para dar una
                            <abbr title="Presentar la idea central de un proyecto en cinco minutos.">
                                charla ignite</abbr>. Cuéntanos de qué quieres hablar!
                        </p>
                    </div>
                    <form action="OradoresController?accion=actualizar" method="POST" autocomplete="off">
                        <div class="row justify-content-center">
                            <div class="d-none">
                                <label for="id" class="form-label"></label>
                                <input type="hidden" class="form-control" id="id" name="id"
                                       value="<%= orador.getId()%>" />
                            </div>
                            <div class="col-12 col-sm-6 col-lg-4 mb-3">
                                <input type="text" class="form-control form-control-sm" placeholder="Nombre"
                                       aria-label="Nombre" id="nombre" name="nombre"
                                       value="<%= orador.getNombre()%>" />
                            </div>
                            <div class="col-12 col-sm-6 col-lg-4 mb-3">
                                <input type="text" class="form-control form-control-sm" placeholder="Apellido"
                                       aria-label="Apellido" id="apellido" name="apellido"
                                       value="<%= orador.getApellido()%>" />
                            </div>
                            <div class="col-12 col-lg-8">
                                <textarea class="form-control" placeholder="Sobre qué quieres hablar?" rows="3"
                                          id="tema" name="tema"><%= orador.getTema()%></textarea>
                            </div>
                            <div class="col-12 col-lg-8">
                                <p class="fs-8 m-0 mt-2 mb-3 p-0">Recuerda incluir un título para tu charla</p>
                            </div>
                            <div class="col-12 col-lg-8">
                                <input type="submit" value="Modificar" class="btn btn-enviar w-100" />
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
