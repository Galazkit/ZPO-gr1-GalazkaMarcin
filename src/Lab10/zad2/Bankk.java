package Lab10.zad2;

import java.util.ArrayList;
import java.util.List;

public class Bankk implements Wiadomosc {
    private List<Konto> Klienci = new ArrayList<Konto>();
    private ArrayList<String> Wiadomości = new ArrayList<String>();

    public void dodajKlienta(Konto klient) {
        Klienci.add(klient);
    }

    public void historiaWiadomosci(){
        for(String mess: Wiadomości){
            System.out.println(mess);
        }
    }

    public void wyslijBank(String wiadomosc) {
        Wiadomości.add(wiadomosc);
        powiadom();
    }

    public void powiadom(){
        for(Konto klient : Klienci){
            klient.update(Wiadomości.get(Wiadomości.size()-1));
        }
    }
}
