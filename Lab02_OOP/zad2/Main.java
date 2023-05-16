package zad2;

public class Main {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Ford", "S-Max", "Minivan", "Srebrny", 2011, 124000);
        Samochod samochod2 = new Samochod();
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy("BMW", "X5", "SUV", "Szary", 2021, 18400, 3.5, 4.2,
                5);

        samochod1.wyswietlInformacje();
        System.out.println();
        samochod2.wyswietlInformacje();
        System.out.println();
        samochodOsobowy.wyswietlInformacje();
    }
}
