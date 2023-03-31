import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj ilość wyrazów ciągu: ");
        int n = in.nextInt();
        int[] ciag = new int[n];
        int suma = 0;
        System.out.println("Podaj "+n+" liczb:");

        for (int i = 0; i < n; i++) {
            ciag[i] = in.nextInt();
            if (ciag[i] % 2 == 0) {
                suma += ciag[i];
            }
        }
        System.out.println("Suma liczb parzystych w ciągu wynosi: "+suma);
    }
}
