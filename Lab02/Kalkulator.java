package lab02;
import org.w3c.dom.ls.LSInput;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
    Run();
    }



    public static void Menu(){
        System.out.println("\n\t\t\t=====================");
        System.out.println("\t\t\t====Kalkulator====");
        System.out.println("\t\t\t=====================");
        System.out.println("\t\t\t1. Suma" +
                "\n\t\t\t2. Różnica" +
                "\n\t\t\t3. Iloczyn" +
                "\n\t\t\t4. Iloraz" +
                "\n\t\t\t5. Potęga" +
                "\n\t\t\t6. Pierwiastek" +
                "\n\t\t\t7. Funkcje trygonometryczne (sin, cos, tg, ctg)" +
                "\n\t\t\t8. Wyjście");
        System.out.println("\t\t\t-------------------------------");
        System.out.println("\t\t\t\tWybierz operacje: ");

    }
    public static void Run() //menu z opcją wyboru
    {
        int wybor;
        while (true)
        {
        Menu();
        wybor = InputInt();
        switch (wybor)
        {
            case 1: suma();
                break;
            case 2: roznica();
                break;
            case 3: iloczyn();
                break;
            case 4: iloraz();
                break;
            case 5: potega();
                break;
            case 6: pierwiastek();
                break;
            case 7: funTryg();
                break;
            case 8: Close();
            default: Error();
        }
        }//koniec while
    }

    public static void Error()
    {
        System.out.println("Błędne dane, koniec programu");
        System.exit(0);
    }
        public static int InputInt() {  //opcja menu
        Scanner input = new Scanner(System.in);
        int liczba = 0;
        liczba = input.nextInt();
        return liczba;
    }

    public static void Close() { //koniec programu
        System.out.println("\t\t\tCzy na pewno chcesz wyjść t || T");
        String znak = InputString();
        String st1="t";
        String st2="T";
        if (znak.equals(st1) || znak.equals(st2)) System.exit(0);
    }

    public static String InputString() {  //potwierdzenie zakończenia programu
        Scanner input = new Scanner(System.in);
        String znak = input.nextLine();
        return znak;
    }

    public static void suma() {
        System.out.println("Wybrano funkcję sumy\nPodaj pierwszą cyfrę");
        Scanner dodawanie = new Scanner(System.in);
        double skladnik1 = 0;
        double skladnik2 = 0;
        try {
            skladnik1 = dodawanie.nextDouble();
            System.out.println("Podaj drugą cyfrę");
            skladnik2 = dodawanie.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane, podaj poprawną liczbę");
            return;
        }
        System.out.format("Suma liczb " + skladnik1 + " i " + skladnik2 + " wynosi: %.4f\n\n", (skladnik1 + skladnik2));
    }


    public static void roznica() {
        System.out.println("Wybrano funkcję różnicy\nPodaj pierwszą cyfrę");
        Scanner odejmowanie = new Scanner(System.in);
        double odjemna = 0;
        double odjemnik = 0;
        try {
            odjemna = odejmowanie.nextDouble();
            System.out.println("Podaj drugą cyfrę");
            odjemnik = odejmowanie.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane, podaj poprawną liczbę");
            return;
        }

        System.out.format("Różnica liczb " + odjemna + " i " + odjemnik + " wynosi: %.4f\n\n", (odjemna - odjemnik));
    }

    public static void iloczyn(){
        System.out.println("Wybrano funkcję iloczynu\nPodaj pierwszą cyfrę");
        Scanner mnozenie = new Scanner(System.in);
        double czynnik1 = 0;
        double czynnik2 = 0;
        try {
            czynnik1 = mnozenie.nextDouble();
            System.out.println("Podaj drugą cyfrę");
            czynnik2 = mnozenie.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane, podaj poprawną liczbę");
            return;
        }
        System.out.format("Iloczyn liczb "+czynnik1+" i "+czynnik2+" wynosi %.4f\n\n: ",(czynnik1*czynnik2));
    }

    public static void iloraz(){
        System.out.println("Wybrano funkcję ilorazu\nPodaj pierwszą cyfrę");
        Scanner dzielenie = new Scanner(System.in);
        double dzielna = 0;
        double dzielnik = 0;
        try {
            dzielna = dzielenie.nextDouble();
            System.out.println("Podaj drugą cyfrę");
            dzielnik = dzielenie.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane, podaj poprawną liczbę");
            return;
        }
        System.out.format("Iloraz liczb "+dzielna+" i "+dzielnik+" wynosi %.4f\n\n: ",(dzielna/dzielnik));
    }

    public static void potega() {
        System.out.println("Wybrano funkcję potęgowania\nPodaj podstawę potęgi");
        Scanner potegowanie = new Scanner(System.in);
        double podstawa = 0;
        double wykladnik = 0;
        try {
            podstawa = potegowanie.nextDouble();
            System.out.println("Podaj wykładnik potęgi");
            wykladnik = potegowanie.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane, podaj poprawną liczbę");
            return;
        }
        System.out.format("Liczba " + podstawa + " podniesiona do potęgi " + wykladnik + " wynosi %.4f\n\n", (Math.pow(podstawa, wykladnik)));
    }

    public static void pierwiastek(){
        System.out.println("Wybrano funkcję pierwiastkowania\nPodaj liczbę do spierwiastkowania");
        Scanner pierwiastkowanie = new Scanner(System.in);
        double lbPodpierwiastkowa = 0;
        try {
            lbPodpierwiastkowa = pierwiastkowanie.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane, podaj poprawną liczbę");
            return;
        }
        System.out.println("Pierwiastek z liczby "+lbPodpierwiastkowa+" jest równy: "+Math.sqrt(lbPodpierwiastkowa));
    }

    public static void funTryg() {
        System.out.println("Wybrano funkcję obliczania wartości funkcji trygonometrycznych\nPodaj kąt dla którego chcesz obliczyć sin, cos, tg i ctg");
        Scanner fTryg = new Scanner(System.in);
        double kat = 0;
        try {
            kat = fTryg.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane, podaj poprawną liczbę");
            return;
        }
        System.out.println("Wartości funkcji trygonometrycznych dla kąta "+kat);
        double wRadianach = Math.toRadians(kat);
        double sinus = Math.sin(wRadianach);
        double cosinus = Math.cos(wRadianach);
        double tangens = Math.tan(wRadianach);
        double cotangens = 1.0/tangens;
        System.out.println("Sin: "+sinus+"\n"+
                "cos: "+cosinus+"\n"+
                "tg: "+tangens+"\n"+
                "ctg: "+cotangens+"\n");
    }

}
