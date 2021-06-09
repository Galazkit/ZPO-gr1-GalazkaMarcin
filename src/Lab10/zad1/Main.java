package Lab10.zad1;

public class Main {
    public static void main(String[] args) {

        Konto konto1 = new Konto(1000);
        Konto konto2 = new Konto(1800);

        Bankk bankk = new Bankk();
        bankk.dodajKlienta(konto1);
        bankk.dodajKlienta(konto2);

        konto1.zróbOperację(new Wpłata(konto1,100.0));
        konto2.zróbOperację(new Wypłata(konto2,200.0));

        konto1.zróbOperację(new Przelew(konto1,konto2,200.0));
    }
}
