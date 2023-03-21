import java.util.Scanner;

public class sortowanieBabelkowe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów do posortowania:");
        int n = input.nextInt();
        int[] tablica = new int[n];
        System.out.println("Podaj " +n+ " liczb do posortowania:");
        for (int i = 0; i < n; i++) {
            tablica[i] = input.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }
        System.out.println("Posortowane liczby:");
        for (int i = 0; i < n; i++) {
            System.out.print(tablica[i] + " ");
        }
    }
}
