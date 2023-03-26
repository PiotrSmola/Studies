import java.util.Scanner;
public class zad3BezMenu {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double[] array = new double[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Podaj 10 liczb rzeczywistych: ");
                array[i] = in.nextDouble();
            }

            FromStartToEnd(array);
            FromEndToStart(array);
            OddIndexes(array);
            EvenIndexes(array);
            System.out.println("Koniec programu");
        }

        private static void FromStartToEnd(double[] array) {
            System.out.print("Tablica od pierwszego do ostatniego indeksu: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        private static void FromEndToStart(double[] array) {
            System.out.print("Tablica od ostatniego do pierwszego indeksu: ");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        private static void OddIndexes(double[] array) {
            System.out.print("Elementy tablicy o nieparzystych indeksach: ");
            for (int i = 1; i < array.length; i += 2) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        private static void EvenIndexes(double[] array) {
            System.out.print("Elementy tablicy o parzystych indeksach: ");
            for (int i = 0; i < array.length; i += 2) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

