import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String word = in.next();

        if (czyPalindrom(word)) {
            System.out.format("Słowo \"%s\" jest palindromem.",word);
        } else {
            System.out.format("Słowo \"%s\" nie jest palindromem.",word);
        }
    }

    public static boolean czyPalindrom(String word) {
        String backward = "";
        for (int i = word.length()-1; i >= 0; i--) {
            backward += word.charAt(i);
        }

        if (word.equals(backward)) {
            return true;
        } else {
            return false;
        }
    }
}
