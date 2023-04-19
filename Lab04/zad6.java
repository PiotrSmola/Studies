import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Podaj liczbę: ");
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            int silnia = 1;
            for (int j = 1; j <= nums[i]; j++) {
                silnia *= j;
            }
            System.out.println("Silnia liczby "+nums[i]+" wynosi: "+silnia);
        }
    }
}
