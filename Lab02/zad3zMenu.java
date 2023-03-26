import java.util.Scanner;

public class zad3zMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] tablica = new double[10];

        System.out.println("Wprowadź 10 liczb rzeczywistych:");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = in.nextDouble();
        }

        int wybor;
        do {
            System.out.println("\n\nWybierz funkcjonalność programu:");
            System.out.println("1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu");
            System.out.println("2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu");
            System.out.println("3. Wyświetlanie elementów o nieparzystych indeksach");
            System.out.println("4. Wyświetlanie elementów o parzystych indeksach");
            System.out.println("5. Wyjście");

            wybor = in.nextInt();

            if (wybor == 1) {
                System.out.println("\nTablica od pierwszego do ostatniego indeksu:");
                for (int i = 0; i < tablica.length; i++) {
                    System.out.print(tablica[i] + " ");
                }
            } else if (wybor == 2) {
                System.out.println("\nTablica od ostatniego do pierwszego indeksu:");
                for (int i = tablica.length - 1; i >= 0; i--) {
                    System.out.print(tablica[i] + " ");
                }
            } else if (wybor == 3) {
                System.out.println("\nElementy o nieparzystych indeksach:");
                for (int i = 1; i < tablica.length; i += 2) {
                    System.out.print(tablica[i] + " ");
                }
            } else if (wybor == 4) {
                System.out.println("\nElementy o parzystych indeksach:");
                for (int i = 0; i < tablica.length; i += 2) {
                    System.out.print(tablica[i] + " ");
                }
            } else if (wybor == 5) {
                System.out.println("\nKoniec programu.");
            } else {
                System.out.println("\nNieprawidłowy wybór. Spróbuj ponownie.");
            }

        } while (wybor != 5);

        in.close();

    }

}

