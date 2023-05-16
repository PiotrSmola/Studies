package zad3;

// Przykładowe użycie aplikacji
public class Main {
    public static void main(String[] args) {
        ksiegarnia ksiegarnia = new ksiegarnia("Księgarnia książeczka");
        podrecznik podręcznik = new podrecznik("Matematyka dla szkół średnich", "Przemysław Cieszyński", "Matematyka");
        powiesc powiesc = new powiesc("Władca Pierścieni", "J.R.R. Tolkien", "Fantasy");

        klient klient = new klient("Adam", "Nowak", ksiegarnia);
        klient.kupKsiazke(podręcznik);

        System.out.println();

        klient.kupKsiazke(powiesc);
    }
}
