package modelo;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnosDAO {

    private Connection connection;

    public AlumnosDAO() {
        Conexion conexion = new Conexion();
        connection = conexion.getConnection();
    }

    public List<Alumnos> listarAlumnos() {
        PreparedStatement ps;
        ResultSet rs;
        List<Alumnos> lista = new ArrayList<>();

        try {
            ps = connection.prepareStatement("SELECT * FROM participantes");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                int telefono = rs.getInt("telefono");
                Alumnos alumnos = new Alumnos(id, nombre, apellido, email, telefono);
                lista.add(alumnos);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            lista = null;
        }

        return lista;
    }

    public Alumnos mostrarAlumno(int _id) {
        PreparedStatement ps;
        ResultSet rs;
        Alumnos alumno = null;

        try {
            ps = connection.prepareStatement("SELECT * FROM participantes WHERE id = ?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                int telefono = rs.getInt("telefono");
                alumno = new Alumnos(id, nombre, apellido, email, telefono);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            alumno = null;
        }

        return alumno;
    }

    public boolean insertarAlumno(Alumnos alumno) {
        PreparedStatement ps;
        boolean _return = false;

        try {
            ps = connection.prepareStatement("INSERT INTO participantes (nombre, apellido, email, telefono) VALUES (?, ?, ?, ?)");
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getEmail());
            ps.setInt(4, alumno.getTelefono());
            ps.execute();
            _return = true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            _return = false;
        }

        return _return;
    }

    public boolean actualizarAlumno(Alumnos alumno) {
        PreparedStatement ps;
        boolean _return = false;

        try {
            ps = connection.prepareStatement("UPDATE participantes SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id = ?");
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getEmail());
            ps.setInt(4, alumno.getTelefono());
            ps.setInt(5, alumno.getId());
            ps.execute();
            _return = true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            _return = false;
        }

        return _return;
    }

    public boolean eliminarAlumno(int _id) {
        PreparedStatement ps;
        boolean _return = false;

        try {
            ps = connection.prepareStatement("DELETE FROM participantes WHERE id = ?");
            ps.setInt(1, _id);
            ps.execute();
            _return = true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            _return = false;
        }

        return _return;
    }

    public int validarUsuario(String email, String password) {
        PreparedStatement ps;
        ResultSet rs;
        int id = 0;

        try {
            ps = connection.prepareStatement("SELECT id FROM usuarios WHERE email = ? AND password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            id = -1;
        }

        return id;
    }
}
