package modelo;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OradoresDAO {

    private Connection connection;

    public OradoresDAO() {
        Conexion conexion = new Conexion();
        connection = conexion.getConnection();
    }

    public List<Oradores> listarOradores() {
        PreparedStatement ps;
        ResultSet rs;
        List<Oradores> lista = new ArrayList<>();

        try {
            ps = connection.prepareStatement("SELECT * FROM oradores");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String tema = rs.getString("tema");
                Oradores oradores = new Oradores(id, nombre, apellido, tema);
                lista.add(oradores);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            lista = null;
        }

        return lista;
    }

    public Oradores mostrarOrador(int _id) {
        PreparedStatement ps;
        ResultSet rs;
        Oradores orador = null;

        try {
            ps = connection.prepareStatement("SELECT * FROM oradores WHERE id = ?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String tema = rs.getString("tema");
                orador = new Oradores(id, nombre, apellido, tema);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            orador = null;
        }

        return orador;
    }

    public boolean insertarOrador(Oradores orador) {
        PreparedStatement ps;
        boolean _return = false;

        try {
            ps = connection.prepareStatement("INSERT INTO oradores (nombre, apellido, tema) VALUES (?, ?, ?)");
            ps.setString(1, orador.getNombre());
            ps.setString(2, orador.getApellido());
            ps.setString(3, orador.getTema());
            ps.execute();
            _return = true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            _return = false;
        }

        return _return;
    }

    public boolean actualizarOrador(Oradores orador) {
        PreparedStatement ps;
        boolean _return = false;

        try {
            ps = connection.prepareStatement("UPDATE oradores SET nombre = ?, apellido = ?, tema = ? WHERE id = ?");
            ps.setString(1, orador.getNombre());
            ps.setString(2, orador.getApellido());
            ps.setString(3, orador.getTema());
            ps.setInt(4, orador.getId());
            ps.execute();
            _return = true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            _return = false;
        }

        return _return;
    }

    public boolean eliminarOrador(int _id) {
        PreparedStatement ps;
        boolean _return = false;

        try {
            ps = connection.prepareStatement("DELETE FROM oradores WHERE id = ?");
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
