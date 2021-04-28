package Lab5.zad67;

public class Main {
    public static void main(String[] args) {
        SterownikDecorator linia0 = new punktPoczatkowy(0, 0, 100);
        SterownikDecorator linia1 = new Linie(linia0, 15, 15);
        linia1.ustalPozycje(25,25);
        SterownikDecorator druakreczka = new Linie(linia1,20,20);

        Klient klient = new Klient(druakreczka);
        klient.zaladujTusz(20);

        System.out.println(druakreczka.historiaAkcji());
        System.out.println("--------------------------------");
        System.out.println("Tusz: " + druakreczka.sprawdzIlosc());

    }
}
