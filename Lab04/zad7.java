public class zad7 {
    public static void main(String[] args) {
        String[] array1 = {"pierwszy element", "drugi element", "trzeci element"};
        String[] array2 = {"pierwszy element", "drugi element", "trzeci element"};
        boolean isEqual = true;

        if (array1.length != array2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (!array1[i].equals(array2[i])) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("Obie tablice są takie same");
        } else {
            System.out.println("Tablice są różne");
        }
    }
}
