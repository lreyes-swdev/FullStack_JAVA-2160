<%@page import="modelo.Oradores"%>
<%@page import="modelo.OradoresDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Orador</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>

    <body>
        <%
            int _id = Integer.parseInt(request.getParameter("id"));
            OradoresDAO oradoresDAO = new OradoresDAO();
            Oradores orador = oradoresDAO.mostrarOrador(_id);
        %>
        <h1 class="text-center">Modificar Orador!</h1>
        <div class="container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="OradoresController?accion=actualizar" method="POST">
                    <div class="mb-3">
                        <label for="id" class="form-label"></label>
                        <input type="hidden" class="form-control" id="id" name="id"
                               value="<%= orador.getId()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombre</label>
                        <input type="text" class="form-control" id="nombre" name="nombre"
                               value="<%= orador.getNombre()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="apellido" class="form-label">Apellido</label>
                        <input type="text" class="form-control" id="apellido" name="apellido"
                               value="<%= orador.getApellido()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="tema" class="form-label">Tema</label>
                        <input type="text" class="form-control" id="tema" name="tema"
                               value="<%= orador.getTema()%>" />
                    </div>
                    <button type="submit" class="btn btn-primary">Modificar</button>
                </form>
            </div>
        </div>
    </body>
</html>
