
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionOracle {

    public static Connection getConnection() throws SQLException{
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String user ="System";//Usuario de la conexion
        String password = "123";//Contraseña de la conexion
        try {
            Class.forName("oracle.jdbc.OracleDriver");//Diver de la base de datos
            System.out.println("Conectado Correctamente");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base datos");
        }
        return DriverManager.getConnection(url, user, password);
    }

}
