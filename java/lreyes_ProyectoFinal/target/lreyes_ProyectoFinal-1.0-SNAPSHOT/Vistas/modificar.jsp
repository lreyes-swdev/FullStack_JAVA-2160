<%@page import="modelo.Alumnos"%>
<%@page import="modelo.AlumnosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Alumno</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>

    <body>
        <%
            int _id = Integer.parseInt(request.getParameter("id"));
            AlumnosDAO alumnosDAO = new AlumnosDAO();
            Alumnos alumno = alumnosDAO.mostrarAlumno(_id);
        %>
        <h1 class="text-center">Modificar Alumno!</h1>
        <div class="container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="AlumnosController?accion=actualizar" method="POST">
                    <div class="mb-3">
                        <label for="id" class="form-label"></label>
                        <input type="hidden" class="form-control" id="id" name="id"
                               value="<%= alumno.getId()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombre</label>
                        <input type="text" class="form-control" id="nombre" name="nombre"
                               value="<%= alumno.getNombre()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="apellido" class="form-label">Apellido</label>
                        <input type="text" class="form-control" id="apellido" name="apellido"
                               value="<%= alumno.getApellido()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" id="email" name="email"
                               value="<%= alumno.getEmail()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="telefono" class="form-label">Telefono</label>
                        <input type="text" class="form-control" id="telefono" name="telefono"
                               value="<%= alumno.getTelefono()%>" />
                    </div>
                    <button type="submit" class="btn btn-primary">Modificar</button>
                </form>
            </div>
        </div>
    </body>
</html>
