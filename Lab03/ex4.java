import java.util.Scanner;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();
        System.out.print("Enter the length of the numerical sequence: ");
        int n = in.nextInt();
        int[] numSequence = new int[n];
        System.out.println("Drawn numbers from the range (-10.45):");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numSequence[i] = randNum.nextInt(56)-10;
            System.out.print(numSequence[i] + " ");
            if (numSequence[i] % 2 == 0) {
                sum += numSequence[i];
            }
        }
        System.out.println("\n\nThe sum of the even numbers in the sequence is: "+sum);
    }
}
