import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students in the group: ");
        int n = in.nextInt();

        int totalPoints = 0;
        int i = 0;

        while (i < n) {
            System.out.print("Enter the number of points for the student "+(i+1)+": ");
            int points = in.nextInt();
            totalPoints += punkty;
            i++;
        }

        double avgPoints = (double) totalPoints / n;
        System.out.println("The average number of points in the group is: " + avgPoints);
    }
}
