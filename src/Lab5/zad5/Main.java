package Lab5.zad5;

public class Main {
    public static void main(String[] args) {

        DrukarkaSettings drukarka = new punktPoczatkowy(0, 0, 100);
        DrukarkaSettings l1 = new Linia(drukarka, 5, 5);
        DrukarkaSettings l2 = new Linia(l1, 25, 20);
        DrukarkaSettings l3 = new Linia(l2, 38, 30);
        DrukarkaSettings l4 = new Linia(l3, 20 , 15);



        l4.ustalPozycje(5,5);

        System.out.println(l4.historiaAkcji());
        System.out.println("--------------------------------");
        System.out.println("Tusz: " + l4.getTusz());

    }
}
