import java.util.Arrays;
import java.util.Scanner;

public class zad5p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ciąg liczb oddzielonych spacjami:");
        String num = in.nextLine();
        String[] numbers = num.split(" ");
        int[] intNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(intNumbers);
        System.out.println("Liczby po posortowaniu:");
        for (int number : intNumbers) {
            System.out.print(number + " ");
        }
    }
}
