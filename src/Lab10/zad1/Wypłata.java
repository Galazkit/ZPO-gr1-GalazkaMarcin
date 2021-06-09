package Lab10.zad1;

public class Wypłata implements OperacjaBankowa{
    Konto konto;
    Double wartosc;

    public Wypłata(Konto konto, Double wartosc){
        this.konto = konto;
        this.wartosc = wartosc;
    }

    public void wykonaj(){
        konto.wykonajWypłatę(wartosc);
    }
}
