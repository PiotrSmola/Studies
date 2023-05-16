package zad2;

import java.util.Scanner;

class Samochod {
    private String marka;
    private String model;
    private String nadwozie;
    private String kolor;
    private int rokProdukcji;
    private int przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = Math.max(przebieg, 0);
    }

    public Samochod() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj markę samochodu: ");
        this.marka = scanner.nextLine();

        System.out.print("Podaj model samochodu: ");
        this.model = scanner.nextLine();

        System.out.print("Podaj rodzaj nadwozia samochodu: ");
        this.nadwozie = scanner.nextLine();

        System.out.print("Podaj kolor samochodu: ");
        this.kolor = scanner.nextLine();

        System.out.print("Podaj rok produkcji samochodu: ");
        this.rokProdukcji = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj przebieg samochodu: ");
        this.przebieg = Math.max(scanner.nextInt(), 0);
        scanner.nextLine();
    }

    public void wyswietlInformacje() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Nadwozie: " + nadwozie);
        System.out.println("Kolor: " + kolor);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg + " km");
    }
}

class SamochodOsobowy extends Samochod {
    private double waga;
    private double pojemnoscSilnika;
    private int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji,
                           int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    public SamochodOsobowy() {
        super();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wagę samochodu (2-4.5t): ");
        this.waga = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Podaj pojemność silnika samochodu (0.8-3.0): ");
        this.pojemnoscSilnika = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Podaj ilość osób w samochodzie: ");
        this.iloscOsob = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Waga: " + waga + " t");
        System.out.println("Pojemność silnika: " + pojemnoscSilnika);
        System.out.println("Ilość osób: " + iloscOsob + "\n");
    }
}

