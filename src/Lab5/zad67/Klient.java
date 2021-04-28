package Lab5.zad67;

public class Klient implements IManagerTuszu{
    SterownikDecorator drukareczka;

    public Klient(SterownikDecorator drukareczka){
        this.drukareczka = drukareczka;
    }

    @Override
    public void zaladujTusz(int ilosc) {
        this.drukareczka.zasobnikTuszu += ilosc;
    }

    @Override
    public void pobierzTusz(int ilosc) {
        this.drukareczka.zasobnikTuszu -= ilosc;
    }

    @Override
    public int sprawdzIlosc() {
        return this.drukareczka.sprawdzIlosc();
    }

    public String  historiaAkcji() {
        return this.drukareczka.historiaAkcji();
    }
}
