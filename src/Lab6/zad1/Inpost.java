package Lab6.zad1;

public class Inpost implements IDostarcz {
    @Override
    public void dostarcz(String paczka) {

        System.out.println("Inpost: " + paczka);
        System.out.println("Paczka czeka na odbiór w paczkomacie");
    }
}
