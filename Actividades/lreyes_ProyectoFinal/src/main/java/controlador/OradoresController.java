package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Oradores;
import modelo.OradoresDAO;

@WebServlet(name = "OradoresController", urlPatterns = {"/OradoresController"})
public class OradoresController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OradoresDAO oradoresDAO = new OradoresDAO();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");
        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("index.html");
        } else if (accion.equals("modificar")) {
            dispatcher = request.getRequestDispatcher("Vistas/modificar_orador.jsp");
        } else if (accion.equals("nuevo")) {
            dispatcher = request.getRequestDispatcher("Vistas/nuevo_orador.jsp");
        } else if (accion.equals("eliminar")) {
            oradoresDAO.eliminarOrador(Integer.parseInt(request.getParameter("id")));
            dispatcher = request.getRequestDispatcher("Vistas/oradores.jsp");
        }
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OradoresDAO oradoresDAO = new OradoresDAO();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");
        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("index.html");
        } else if (accion.equals("ingresar")) {
            int id = oradoresDAO.validarUsuario(
                    request.getParameter("tUsuario"),
                    request.getParameter("tPassword"));
            if (id > 0) {
                dispatcher = request.getRequestDispatcher("Vistas/oradores.jsp");
            } else {
                dispatcher = request.getRequestDispatcher("index.html");
            }
        } else if (accion.equals("actualizar")) {
            Oradores orador = new Oradores(
                    Integer.parseInt(request.getParameter("id")),
                    request.getParameter("nombre"),
                    request.getParameter("apellido"),
                    request.getParameter("tema"));
            oradoresDAO.actualizarOrador(orador);
            dispatcher = request.getRequestDispatcher("Vistas/oradores.jsp");
        } else if (accion.equals("insertar")) {
            Oradores orador = new Oradores(
                    -1,
                    request.getParameter("nombre"),
                    request.getParameter("apellido"),
                    request.getParameter("tema"));
            oradoresDAO.insertarOrador(orador);
            dispatcher = request.getRequestDispatcher("Vistas/oradores.jsp");
        } else if (accion.equals("enviar")) {
            Oradores orador = new Oradores(
                    -1,
                    request.getParameter("tNombre"),
                    request.getParameter("tApellido"),
                    request.getParameter("taMensaje"));
            oradoresDAO.insertarOrador(orador);
            dispatcher = request.getRequestDispatcher("index.html");
        }

        dispatcher.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
