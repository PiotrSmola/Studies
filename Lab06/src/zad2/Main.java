package zad2;

public class Main {
    public static void main(String[] args) {
        try {
            int liczba = -5; // Przykładowa liczba użyta do wyliczenia silni
            int silnia = Silnia.oblicz(liczba);
            System.out.println("Silnia z " + liczba + " wynosi: " + silnia);
        } catch (Wyjatek e) {
            System.out.println(e.getMessage());
        }
    }
}

