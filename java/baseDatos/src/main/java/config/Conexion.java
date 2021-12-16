package config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    public String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getConnection() throws ClassNotFoundException {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/comision2160",
                    "lreyes_db",
                    "lreyes_db");
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Conexion conexion = new Conexion();
        connection = conexion.getConnection();

        PreparedStatement ps;
        ResultSet rs;

        ps = connection.prepareStatement("SELECT * FROM participantes");
        rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String email = rs.getString("email");
            int telefono = rs.getInt("telefono");
            System.out.println("["+id+"]" + nombre +", "+ apellido +", "+ email +", "+ telefono);
        }
    }
}
