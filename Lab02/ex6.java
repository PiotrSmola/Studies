import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer: ");
            int liczba = input.nextInt();
            if (liczba < 0) {
                break;
            }
        }
        System.out.println("Program end");
    }
}
