package Lab8.zad4;

public class PizzaSycylijska extends Pizza{
    @Override
    void przygotujCiasto() {
        System.out.println("Przygotuj grube ciastko");
    }

    @Override
    void dodajSos() {
        System.out.println("Dodaj sos pomidorowy");
    }

    @Override
    void dodajDodatki() {
        System.out.println("Dodaj oliwki i kapary.");
    }

    @Override
    void dodajPrzyprawy() {
        System.out.println("Dodaj przyprawy");
    }

    @Override
    void pieczPizze() {
        System.out.println("Piecz przez 15 min");
    }
}
