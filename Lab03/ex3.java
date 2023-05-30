import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the numerical sequence: ");
        int n = in.nextInt();
        int[] numSequence = new int[n];
        int sum = 0;
        System.out.println("Enter "+n+" numbers:");

        for (int i = 0; i < n; i++) {
            numSequence[i] = in.nextInt();
            if (numSequence[i] % 2 == 0) {
                sum += numSequence[i];
            }
        }
        System.out.println("The sum of the even numbers in the sequence is: "+sum);
    }
}
