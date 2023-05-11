package zad3;

class Gatunek {
    private String rodzaj;
    private String gatunek;
    private int lbChromosomow2n;
    private int podstLbChromosomowX;
    private String opis;

    public Gatunek(String rodzaj, String gatunek, int lbChromosomow2n, int podstLbChromosomowX, String opis) {
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.lbChromosomow2n = lbChromosomow2n;
        this.podstLbChromosomowX = podstLbChromosomowX;
        this.opis = opis;
    }

    public String pelnaNazwa() {
        return rodzaj + " " + gatunek;
    }

    public int liczbaChromosomowN() {
        return lbChromosomow2n / 2;
    }

    public void wypiszDane() {
        System.out.println("Rodzaj: " + rodzaj);
        System.out.println("Gatunek: " + gatunek);
        System.out.println("Liczba chromosomów 2n: " + lbChromosomow2n);
        System.out.println("Liczba chromosomów x: " + podstLbChromosomowX);
        System.out.println("Opis: " + opis);
    }

    public Gatunek klonuj() {
        return new Gatunek(rodzaj, gatunek, lbChromosomow2n, podstLbChromosomowX, opis);
    }
}

class Main {
    public static void main(String[] args) {
        Gatunek gatunek1 = new Gatunek("Ssak", "Lew", 38, 19, "Duży kot z rodziny kotowatych.");
        Gatunek gatunek2 = new Gatunek("Ptak", "Jastrząb", 34, 17, "Duży ptak drapieżny z rodziny jastrzębiowatych.");
        Gatunek gatunek3 = new Gatunek("Gad", "Żmija zygzakowata", 26, 13, "Jadowity wąż z rodziny żmijowatych.");

        System.out.println("Pełna nazwa gatunku 1: " + gatunek1.pelnaNazwa());
        System.out.println("Haploidalna liczba chromosomów gatunku 1: " + gatunek1.liczbaChromosomowN());

        System.out.println("\nPełna nazwa gatunku 2: " + gatunek2.pelnaNazwa());
        System.out.println("Haploidalna liczba chromosomów gatunku 2: " + gatunek2.liczbaChromosomowN());

        System.out.println("\nPełna nazwa gatunku 3: " + gatunek3.pelnaNazwa());
        System.out.println("Haploidalna liczba chromosomów gatunku 3: " + gatunek3.liczbaChromosomowN());

        System.out.println("\n\tDane gatunku 1\t");
        gatunek1.wypiszDane();

        System.out.println("\n\tDane gatunku 2\t");
        gatunek2.wypiszDane();

        System.out.println("\n\tDane gatunku 3\t");
        gatunek3.wypiszDane();

        Gatunek sklonowanyGatunek = gatunek1.klonuj();
        System.out.println("\n\tKlonowanie gatunku 1\t");
        sklonowanyGatunek.wypiszDane();
    }
}

