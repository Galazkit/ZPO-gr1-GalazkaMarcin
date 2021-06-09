package Lab10.zad1;

import java.util.ArrayList;
import java.util.List;

public class Bankk {
    private List<Konto> Klienci = new ArrayList<Konto>();

    public void dodajKlienta(Konto klient) {
        Klienci.add(klient);
    }

}
