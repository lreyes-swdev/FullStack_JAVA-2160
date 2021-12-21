package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Alumnos;
import modelo.AlumnosDAO;

@WebServlet(name = "AlumnosController", urlPatterns = {"/AlumnosController"})
public class AlumnosController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AlumnosDAO alumnosDAO = new AlumnosDAO();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");
        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("index.jsp");
        } else if (accion.equals("modificar")) {
            dispatcher = request.getRequestDispatcher("Vistas/modificar.jsp");
        } else if (accion.equals("nuevo")) {
            dispatcher = request.getRequestDispatcher("Vistas/nuevo.jsp");
        } else if (accion.equals("eliminar")) {
            alumnosDAO.eliminarAlumno(Integer.parseInt(request.getParameter("id")));
            dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
        }
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AlumnosDAO alumnosDAO = new AlumnosDAO();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");
        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("index.jsp");
        } else if (accion.equals("actualizar")) {
            Alumnos alumno = new Alumnos(
                    Integer.parseInt(request.getParameter("id")),
                    request.getParameter("nombre"),
                    request.getParameter("apellido"),
                    request.getParameter("email"),
                    Integer.parseInt(request.getParameter("telefono")));
            alumnosDAO.actualizarAlumno(alumno);
            dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
        } else if (accion.equals("insertar")) {
            Alumnos alumno = new Alumnos(
                    -1,
                    request.getParameter("nombre"),
                    request.getParameter("apellido"),
                    request.getParameter("email"),
                    Integer.parseInt(request.getParameter("telefono")));
            alumnosDAO.insertarAlumno(alumno);
            dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
        } else if (accion.equals("ingresar")) {
            int id = alumnosDAO.validarUsuario(
                    request.getParameter("email"),
                    request.getParameter("password"));
            if (id > 0) {
                dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
            } else {
                dispatcher = request.getRequestDispatcher("index.jsp");
            }
        }
        dispatcher.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
