import java.sql.*;

public class ListaObecnosci {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:lista_obecnosci.db";
        return DriverManager.getConnection(url);
    }


}
