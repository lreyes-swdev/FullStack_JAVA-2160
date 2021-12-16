<%-- 
    Document   : ventas
    Created on : 9 nov. 2021, 14:56:37
    Author     : lreyes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int num = 3;
            double num2 = 30.3;

            double suma() {
                return num + num2;
            }
        %>
        <%
            String nombre = "Leand";
            String usuario = request.getParameter("usuario");

            out.println("<p>" + num + "</p>");
            out.println("<p>" + suma() + "</p>");
        %>
        <h1>Hello <%=nombre%> con <%=usuario%></h1>
        <p><%java.util.Date fecha = new java.util.Date();%><%=fecha%><i> timestamp</i></p>
    </body>
</html>
