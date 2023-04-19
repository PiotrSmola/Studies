import java.util.Arrays;

public class zad7v2 {
    public static void main(String[] args) {
        String[] array1 = {"pierwszy element", "drugi element", "trzeci element"};
        String[] array2 = {"pierwszy element", "drugi element", "trzeci element"};
        boolean isEqual = Arrays.equals(array1, array2);

        if (isEqual) {
            System.out.println("Obie tablice są takie same.");
        } else {
            System.out.println("Tablice są różne.");
        }
    }
}
