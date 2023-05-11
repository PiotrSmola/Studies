package Lab01;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("excercise 1");
        System.out.println(zad1());

        System.out.println("excercise 2");
        System.out.println("enter the first number");
        float a1 = in.nextFloat();
        System.out.println("enter the second number");
        float b1 = in.nextFloat();
        zad2(a1,b1);

        System.out.println("excercise 3");
        System.out.println("enter a number");
        int c = in.nextInt();
        System.out.println(zad3(c));

        System.out.println("excercise 4");
        System.out.println("enter a number");
        int d = in.nextInt();
        System.out.println(zad4(d));

        System.out.println("excercise 5");
        System.out.println("enter a number");
        double e = in.nextFloat();
        System.out.println(zad5(e));

        System.out.println("excercise 6");
        System.out.println("enter a number");
        double f = in.nextDouble();
        System.out.println(zad6(f));

        System.out.println("excercise 7");
        System.out.println("enter the lower limit of the range of numbers to be drawn");
        int a = in.nextInt();
        System.out.println("enter the upper limit of the range of numbers to be drawn");
        int b = in.nextInt();
        if (a<b) {
            Random test = new Random();
            int g = test.nextInt(a, b);
            int h = test.nextInt(a, b);
            int j = test.nextInt(a, b);
            System.out.println(zad7(g, h, j));
        }
        else
        {
            System.out.println("Wrong range specified. Program end");
            System.exit(0);
        }
    }
    public static String zad1()
    {
        String imie = "Piotr";
        String wiek = "20";
        return imie + " " + wiek;
    }

    public static float zad2(float a, float b)
    {
        System.out.format("Sum of numbers "+a+" i "+b+" is equal: %.2f\n",(a+b));
        System.out.format("Number difference "+a+" i "+b+" is equal: %.2f\n",(a-b));
        System.out.format("product of numbers "+a+" i "+b+" is equal: %.2f\n",(a*b));
        return 0;
    }
    public static boolean zad3(int c)
    {
        if (c % 2 == 0)
            return true;
        else return false;
    }

    public static boolean zad4(int d)
    {
        if ((d % 3 == 0) && (d % 5 == 0))
            return true;
        else return false;
    }
    public static double zad5(double e)
    {
        return Math.pow(e, 3);
    }

    public static double zad6(double f)
    {
        return Math.sqrt(f);
    }

    public static boolean zad7(int g, int h, int j)
    {
        if (g == 0 || h == 0 || j==0)
            return false;
        else if (((Math.pow(g, 2) == (Math.pow(h, 2)+Math.pow(j, 2))) || (Math.pow(h, 2) == (Math.pow(g, 2)+Math.pow(j, 2))) || (Math.pow(j, 2) == (Math.pow(h, 2)+Math.pow(g, 2)))) && (g != h) && (h != j))
        {
            return true;
        }
        else return false;

    }
}

