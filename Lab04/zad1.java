import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        randNum(tablica);

        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        double srednia = (double) suma / tablica.length;
        System.out.println("Suma elementów wyliczana z użyciem pętli FOR: "+suma);
        System.out.println("Średnia elementów wyliczana z użyciem pętli FOR: "+srednia);

        int sumaForEach = 0;
        for (int element:tablica) {
            sumaForEach += element;
        }
        double sredniaForEach = (double) sumaForEach / tablica.length;
        System.out.println("\nSuma elementów wyliczana z użyciem pętli FOREACH: "+sumaForEach);
        System.out.println("Średnia elementów wyliczana z użyciem pętli FOREACH: "+sredniaForEach);
    }

    public static void randNum(int[] tablica) {
        Random rand = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(10);
        }
    }
}
