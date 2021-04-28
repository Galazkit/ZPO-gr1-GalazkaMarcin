package Lab6.zad1;

public class Kurier implements IDostarcz {
    @Override
    public void dostarcz(String paczka) {
        System.out.println("Kurier dostarcza: " + paczka);
    }
}