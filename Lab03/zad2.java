import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] liczby = new int[10];
        int iloscDodatnich = 0;
        int iloscUjemnych = 0;
        int sumaDodatnich = 0;
        int sumaUjemnych = 0;

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
