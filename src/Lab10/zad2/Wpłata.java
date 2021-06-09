package Lab10.zad2;

public class Wpłata implements OperacjaBankowa {
    Konto konto;
    Double wartosc;

    public Wpłata(Konto konto, Double wartosc){
        this.konto = konto;
        this.wartosc = wartosc;
    }

    public void wykonaj(){
        konto.wykonajWpłatę(wartosc);
    }
}
