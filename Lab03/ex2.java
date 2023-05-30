import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];
        int numOfPositives = 0;
        int numOfNegatives = 0;
        int sumOfPositives = 0;
        int sumOfNegatives = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj "+(i+1)+" liczbę: ");
            liczby[i] = in.nextInt();

            if (liczby[i] > 0) {
                iloscDodatnich++;
                sumaDodatnich += liczby[i];
            } else if (liczby[i] < 0) {
                iloscUjemnych++;
                sumaUjemnych += liczby[i];
            }
        }

        System.out.println("Ilość liczb dodatnich: "+iloscDodatnich);
        System.out.println("Suma liczb dodatnich: "+sumaDodatnich);
        System.out.println("Ilość liczb ujemnych: "+iloscUjemnych);
        System.out.println("Suma liczb ujemnych: "+sumaUjemnych);
    }
}
