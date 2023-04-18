import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj "+(i+1)+" słowo: ");
            words[i] = in.next();
        }

        for (int i = 4; i >= 0; i--) {
            String reversedWord = "";
            for (int j = words[i].length()-1; j >= 0; j--) {
                reversedWord += words[i].charAt(j);
            }
            System.out.println(reversedWord);
        }
    }
}
