package Lab6.zad1;

public class Main {
    public static void main(String[] args) {
        KurierFabryka kurier = new KurierFabryka();
        AwizoFabryka awizo = new AwizoFabryka();
        PocztaFabryka poczta = new PocztaFabryka();
        InpostFabryka inpost = new InpostFabryka();

        kurier.przetwarzajPaczke("paczka 1");
        poczta.przetwarzajPaczke("paczka 2");
        awizo.przetwarzajPaczke("paczka 3");
        inpost.przetwarzajPaczke("paczka4");
    }
}
