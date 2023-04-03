import java.util.Scanner;
import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();
        System.out.print("Podaj długość ciągu: ");
        int n = in.nextInt();
        int[] ciag = new int[n];
        System.out.println("Wylosowane liczby z przedziału (-10,45):");
        int suma = 0;
        for (int i = 0; i < n; i++) {
            ciag[i] = randNum.nextInt(56)-10;
            System.out.print(ciag[i] + " ");
            if (ciag[i] % 2 == 0) {
                suma += ciag[i];
            }
        }
        System.out.println("\n\nSuma liczb parzystych ciągu wynosi: "+suma);
    }
}
