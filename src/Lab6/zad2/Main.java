package Lab6.zad2;

public class Main {
    public static void main(String[] args) {
        StatekFabryka statek = new StatekFabryka();
        SamolotFabryka samolot = new SamolotFabryka();
        CiezarowkaFabryka ciezarowka = new CiezarowkaFabryka();

        ciezarowka.zaladujTowar("zaopatrzenie\n");
        statek.zaladujTowar("kontenery\n");
        samolot.zaladujTowar("pasażerowie i poczta\n");

    }
}
