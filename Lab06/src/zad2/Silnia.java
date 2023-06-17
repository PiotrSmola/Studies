package zad2;

public class Silnia {
    public static int oblicz(int liczba) throws Wyjatek {
        if (liczba < 0) {
            throw new Wyjatek("Nie można obliczyć silni dla liczby ujemnej");
        }
        int silnia = 1;
        for (int i = 1; i <= liczba; i++) {
            silnia *= i;
        }
        return silnia;
    }
}
