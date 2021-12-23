<%@page import="modelo.AlumnosDAO"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Alumnos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>

    <body>
        <h1 class="text-center">Lista de Alumnos!</h1>
        <div class="container">
            <div class="row">
                <a class="btn btn-primary w-25 my-3"
                   href="AlumnosController?accion=nuevo">Agregar Alumno</a>
                <table class="table table-primary">
                    <thead>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Email</th>
                        <th>Telefono</th>
                        <th>Modificar</th>
                        <th>Eliminar</th>
                    </thead>
                    <tbody>
                        <%
                            List<Alumnos> resultado = null;
                            AlumnosDAO alumno = new AlumnosDAO();
                            resultado = alumno.listarAlumnos();
                            
                            for(int x=0; x < resultado.size(); ++x) {
                                String rutaM = "AlumnosController?accion=modificar&id="+resultado.get(x).getId();
                                String rutaE = "AlumnosController?accion=eliminar&id="+resultado.get(x).getId();
                        %>
                            <tr>
                                <td><%= resultado.get(x).getId()%></td>
                                <td><%= resultado.get(x).getNombre()%></td>
                                <td><%= resultado.get(x).getApellido()%></td>
                                <td><%= resultado.get(x).getEmail()%></td>
                                <td><%= resultado.get(x).getTelefono()%></td>
                                <td><a class="text-success" href="<%= rutaM%>">X</a></td>
                                <td><a class="text-danger" href="<%= rutaE%>">X</a></td>
                            </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
