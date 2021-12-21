package config;

import java.sql.*;

public class Conexion {

    public String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driver);
            /*
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/comision2160",
                    "lreyes_db",
                    "lreyes_db");
            */
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lreyes-comision2160",
                    "root",
                    "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
        return connection;
    }

    /*
    public static void main(String[] args) throws SQLException {
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
            System.out.println("[" + id + "] " + nombre + ", " + apellido + ", " + email + ", " + telefono);
        }
    }
    */
}
