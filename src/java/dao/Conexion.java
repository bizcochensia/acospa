package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Conexion {

    private Connection connection;

    public void open() {

        String user = "root";
        String password = "mike93";
        String dbname = "sicoa";
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";

        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url + dbname, user, password);
            //System.out.println( connection.isClosed() );
        } catch (Exception ex) {
            System.out.println("Error al abrir la conexion");
            System.out.println(ex.getMessage());
        }

    }

    public void close() {
        try {
            connection.close();
            System.out.println(connection.isClosed());
        } catch (Exception ex) {
            System.out.println("Error al cerrar la conexion");
            System.out.println(ex.getMessage());
        }

    }

    public void insert(Visitante visitante) {
        try {
            Statement statement = null;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("INSERT INTO visitante (nombre,apPat,apMat,telefono,cel) VALUES ('");
            stringBuilder.append(visitante.getNombre());
            stringBuilder.append("' , '");
            stringBuilder.append(visitante.getApPat());
            stringBuilder.append("' , '");
            stringBuilder.append(visitante.getApMat());
            stringBuilder.append("' , '");
            stringBuilder.append(visitante.getTelefono());
            stringBuilder.append("' , '");
            stringBuilder.append(visitante.getCel());
            stringBuilder.append("' )");
            System.out.println("Query " + stringBuilder.toString());
            statement = connection.createStatement();
            statement.executeUpdate(stringBuilder.toString());
        } catch (Exception ex) {
            System.out.println("Error en el insert");
            System.out.println(ex.getMessage());
        }

    }

}
