<%@page import="modelo.OradoresDAO"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Oradores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Oradores</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>

    <body>
        <h1 class="text-center">Lista de Oradores!</h1>
        <div class="container">
            <div class="row">
                <a class="btn btn-primary w-25 my-3"
                   href="OradoresController?accion=nuevo">Agregar Orador</a>

                <%
                    List<Oradores> resultado = null;
                    OradoresDAO orador = new OradoresDAO();
                    resultado = orador.listarOradores();

                    for (int x = 0; x < resultado.size(); ++x) {
                        String rutaM = "OradoresController?accion=modificar&id=" + resultado.get(x).getId();
                        String rutaE = "OradoresController?accion=eliminar&id=" + resultado.get(x).getId();
                %>
                <div class="card mb-3">
                    <div class="row g-0">
                        <div class="card-body">
                            <h5 class="card-title d-inline"><%= resultado.get(x).getNombre()%> <%= resultado.get(x).getApellido()%></h5>
                            <a href="<%= rutaE%>"><span class="float-end mx-1 badge bg-danger">Eliminar</span></a>
                            <a href="<%= rutaM%>"><span class="float-end mx-1 badge bg-warning text-dark">Modificar</span></a>
                            <p class="card-text"><small class="text-muted"><%= resultado.get(x).getTema()%></small></p>                            
                        </div>
                    </div>
                </div>
                <%
                    }
                %>

            </div>
        </div>
    </body>
</html>
