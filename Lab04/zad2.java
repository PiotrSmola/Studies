public class zad2 {
    public static void main(String[] args) {
        int[] tablica1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] tablica2 = {"This", "program", "is", "written", "in", "JAVA", "language"};

        for (int i = 0; i < tablica1.length; i += 2) {
            System.out.print(tablica1[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < tablica2.length; i += 2) {
            System.out.print(tablica2[i] + " ");
        }
    }
}
