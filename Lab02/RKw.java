import java.util.Scanner;

public class RKw {
    public static void main(String[] args) {
        System.out.println("Podaj a, b i c: ");
        double a = InputDouble();
        double b = InputDouble();
        double c = InputDouble();
        if (a!=0) RozKw(a,b,c);
        else System.out.println("To nie jest równanie kwadratowe");

    }

    public static double InputDouble() {
        Scanner input = new Scanner(System.in);
        double liczba = input.nextDouble();
        return liczba;
    }

    public static void RozKw(double a, double b, double c) {
        double delta = Math.pow(b,2) - (4*a*c);
        if (delta < 0) System.out.println("Brak rozwiązań w zbiorze R");
        else if (delta == 0) System.out.println("Jedno rozwiązanie: "+ (-b/(2*a)));
        else System.out.println("Dwa rozwiązania: x1 = "+ (-b - Math.sqrt(delta))/(2*a) + "\tx2 = " + (-b + Math.sqrt(delta))/(2*a));
    }
}