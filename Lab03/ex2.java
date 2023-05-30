import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];
        int numOfPositives = 0;
        int numOfNegatives = 0;
        int sumOfPositives = 0;
        int sumOfNegatives = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter "+(i+1)+" number: ");
            liczby[i] = in.nextInt();

            if (numbers[i] > 0) {
                numOfPositives++;
                sumOfPositives += numbers[i];
            } else if (numbers[i] < 0) {
                numOfNegatives++;
                sumOfNegatives += numbers[i];
            }
        }

        System.out.println("Number of positive numbers: "+numOfPositives);
        System.out.println("Sum of positive numbers: "+sumOfPositives);
        System.out.println("Number of negative numbers: "+numOfNegatives);
        System.out.println("Sum of negative numbers: "+sumOfNegatives);
    }
}
