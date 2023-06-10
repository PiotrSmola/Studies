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
    
    public static void dodajObecnosc(String prowadzacy, String przedmiot, String imieNazwisko,
                                     String nrAlbumu, Date data, Time czasZalogowania,
                                     Time czasWylogowania, int dlugoscSesji) {
        String sql = "INSERT INTO attendance (prowadzacy, nazwa_przedmiotu, imie_i_nazwisko, nr_albumu, data, czas_zalogowania, czas_wylogowania, dlugosc_sesji) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, prowadzacy);
            pstmt.setString(2, przedmiot);
            pstmt.setString(3, imieNazwisko);
            pstmt.setString(4, nrAlbumu);
            pstmt.setDate(5, data);
            pstmt.setTime(6, czasZalogowania);
            pstmt.setTime(7, czasWylogowania);
            pstmt.setInt(8, dlugoscSesji);
            pstmt.executeUpdate();
            System.out.println("Obecność studenta została dodana do listy");
        } catch (SQLException e) {
            System.out.println("Wystąpił błąd podczas dodawania obecności studenta: " + e.getMessage());
        }
    }

}
