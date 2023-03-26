import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] tablica = new int[10];

        System.out.println("Wprowadź 10 liczb:");
        for (int i = 0; i < 10; i++) {
            tablica[i] = in.nextInt();
        }

        int suma = 0;
        int iloczyn = 1;
        double srednia = 0;
        int min = tablica[0];
        int max = tablica[0];

        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
            iloczyn *= tablica[i];
            if (tablica[i] < min) {
                min = tablica[i];
            }
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }

        srednia = (double)suma/tablica.length;

        while(true) {
            System.out.println("\nMENU:");
            System.out.println("1. Suma elementów tablicy");
            System.out.println("2. Iloczyn elementów tablicy");
            System.out.println("3. Średnia wartość elementów tablicy");
            System.out.println("4. Wartość minimalna");
            System.out.println("5. Wartość maksymalna");
            System.out.println("6. Wyjście");
            System.out.print("\nWybierz opcję: ");
            int wybor = in.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("Suma elementów tablicy: " + suma);
                    break;
                case 2:
                    System.out.println("Iloczyn elementów tablicy: " + iloczyn);
                    break;
                case 3:
                    System.out.println("Średnia wartość elementów tablicy: " + srednia);
                    break;
                case 4:
                    System.out.println("Wartość minimalna: " + min);
                    break;
                case 5:
                    System.out.println("Wartość maksymalna: " + max);
                    break;
                case 6:
                    Close();
                default:
                    Error();
                    break;
            }
        }
    }
    public static void Error()
    {
        System.out.println("Błędne dane, koniec programu");
        System.exit(0);
    }

    public static String InputString() {  //potwierdzenie zakończenia programu
        Scanner input = new Scanner(System.in);
        String znak = input.nextLine();
        return znak;
    }

    public static void Close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjść t || T");
        String znak = InputString();
        String st1="t";
        String st2="T";
        if (znak.equals(st1) || znak.equals(st2)) System.exit(0);
    }
}
