import java.sql.*;

public class ListaObecnosci {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:lista_obecnosci.db";
        return DriverManager.getConnection(url);
    }
    public static void stworzTabele() {
        String sql = "CREATE TABLE IF NOT EXISTS obecnosc (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "prowadzacy TEXT," +
                "nazwa_przedmiotu TEXT," +
                "imie_i_nazwisko TEXT," +
                "nr_albumu TEXT," +
                "data DATE," +
                "czas_zalogowania TIME," +
                "czas_wylogowania TIME," +
                "dlugosc_sesji INTEGER)";
        try (Connection polacz = getConnection();
             Statement stmt = polacz.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela z listą obecności została utworzona");
        } catch (SQLException e) {
            System.out.println("Wystąpił błąd podczas tworzenia tabeli z listą obecności: " + e.getMessage());
        }
    }

}
