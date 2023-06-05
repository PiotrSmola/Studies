import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.next();

        if (isPalindrome(word)) {
            System.out.format("The word \"%s\" is a palindrome.",word);
        } else {
            System.out.format("The word \"%s\" isn't a palindrome.",word);
        }
    }

    public static boolean isPalindrome(String word) {
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
