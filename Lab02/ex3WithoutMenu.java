import java.util.Scanner;
public class ex3WithoutMenu {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double[] array = new double[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter 10 real numbers: ");
                array[i] = in.nextDouble();
            }

            FromStartToEnd(array);
            FromEndToStart(array);
            OddIndexes(array);
            EvenIndexes(array);
            System.out.println("Program end");
        }

        private static void FromStartToEnd(double[] array) {
            System.out.print("An array from first to last index: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        private static void FromEndToStart(double[] array) {
            System.out.print("Array from last to first index: ");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        private static void OddIndexes(double[] array) {
            System.out.print("Array elements with odd indexes: ");
            for (int i = 1; i < array.length; i += 2) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        private static void EvenIndexes(double[] array) {
            System.out.print("Array elements with even indexes: ");
            for (int i = 0; i < array.length; i += 2) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

