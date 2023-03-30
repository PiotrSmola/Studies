import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę studentów w grupie: ");
        int n = in.nextInt();

        int sumaPunktow = 0;
        int i = 0;

        while (i < n) {
            System.out.print("Podaj liczbę punktów dla studenta "+(i+1)+": ");
            int punkty = in.nextInt();
            sumaPunktow += punkty;
            i++;
        }

        double sredniaPunktow = (double) sumaPunktow / n;
        System.out.println("Średnia liczba punktów w grupie wynosi: " + sredniaPunktow);
    }
}
