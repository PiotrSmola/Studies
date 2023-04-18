import java.util.Arrays;
import java.util.Scanner;

public class zad5p1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[8];
        System.out.println("Podaj 8 liczb:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Posortowane liczby:");
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
