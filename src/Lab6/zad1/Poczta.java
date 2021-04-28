package Lab6.zad1;

public class Poczta implements IDostarcz {
    @Override
    public void dostarcz(String paczka) {
        System.out.println("Poczta dostarcza: " + paczka);
    }
}
