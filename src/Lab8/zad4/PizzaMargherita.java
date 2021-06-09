package Lab8.zad4;

public class PizzaMargherita extends Pizza{

    @Override
    void przygotujCiasto() {
        System.out.println("Przygotuj cienkie ciastko");
    }

    @Override
    void dodajSos() {
        System.out.println("Dodaj sos pomidorowy");
    }

    @Override
    void dodajDodatki() {
        System.out.println("Dodaj ser mozzarella");
        System.out.println("Dodaj ser mozzarella");
    }

    @Override
    void dodajPrzyprawy() {
        System.out.println("Dodaj bazylie i odrobinę oliwy");
    }

    @Override
    void pieczPizze() {
        System.out.println("Piecz przez 15 min");
    }
}
