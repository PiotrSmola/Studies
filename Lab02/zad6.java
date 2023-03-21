import java.util.Scanner;
public class zad6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbę całkowitą: ");
            int liczba = input.nextInt();
            if (liczba < 0) {
                break;
            }
        }
        System.out.println("Koniec programu");
    }
}
