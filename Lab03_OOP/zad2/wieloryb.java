package zad2;

public class wieloryb extends ryba implements plywanie {
    @Override
    public void plyn() {
        System.out.println("Wieloryb płynie");
    }

    @Override
    public void wynurz() {
        System.out.println("Wieloryb wynurza się");
    }

    @Override
    public void zanurz() {
        System.out.println("Wieloryb zanurza się");
    }
}

