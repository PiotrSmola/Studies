package zad3;

class ksiazka {
    private String tytul;
    private String autor;

    public ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void wyswietlInfo() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
    }
}

// Klasa Potręcznik dziedzicząca po Książka
class podrecznik extends ksiazka {
    private String przedmiot;

    public podrecznik(String tytuł, String autor, String przedmiot) {
        super(tytuł, autor);
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Przedmiot: " + przedmiot);
    }
}

// Klasa Powieść dziedzicząca po Książka
class powiesc extends ksiazka {
    private String gatunek;

    public powiesc(String tytuł, String autor, String gatunek) {
        super(tytuł, autor);
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }

    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Gatunek: " + gatunek);
    }
}

// Klasa Klient
class klient {
    private String imie;
    private String nazwisko;
    private ksiegarnia ksiegarnia;

    public klient(String imie, String nazwisko, ksiegarnia ksiegarnia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ksiegarnia = ksiegarnia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void kupKsiazke(ksiazka ksiazka) {
        ksiegarnia.sprzedajKsiazke(ksiazka);
    }
}

// Klasa Księgarnia
class ksiegarnia {
    private String nazwa;

    public ksiegarnia(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void sprzedajKsiazke(ksiazka ksiazka) {
        System.out.println("Klient kupił książkę w księgarni " + nazwa);
        ksiazka.wyswietlInfo();
    }
}

