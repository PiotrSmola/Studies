package zad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Podaj liczbę");
            double liczba = in.nextDouble();

            if (liczba < 0) {
                throw new IllegalArgumentException("Liczba musi być dodatnia!");
            }

            double pierwiastek = Math.sqrt(liczba);
            System.out.println("Pierwiastek z liczby " + liczba + " wynosi: " + pierwiastek);
        } catch (InputMismatchException e) {
            System.out.println("Podano literę zamiast liczby. Koniec programu");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
