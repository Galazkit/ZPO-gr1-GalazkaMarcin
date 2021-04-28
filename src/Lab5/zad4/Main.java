package Lab5.zad4;

public class Main {
    public static void main(String[] args) {
        OrderDecorator Zamówienie = new OrderBase(148);
        OrderDecorator Mackotka = new Maskotka(Zamówienie);
        OrderDecorator Smyczka = new Smyczka(Mackotka);
        OrderDecorator Rabat = new Rabat(Smyczka);
        OrderDecorator Całość = new Transport(Rabat);

        System.out.println("Zamówienie zawiera: " + Całość.getDescription());
        System.out.println("Koszt zamówienia: " + Całość.getCost());
    }
}
