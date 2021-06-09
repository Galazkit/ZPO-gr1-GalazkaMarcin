package Lab10.zad1;

public class Konto {
    private double stanKonta = 0.0;

    public Konto(double stanKonta){
        this.stanKonta = stanKonta;
    }

    public void wykonajWpłatę(Double wartosc){
        this.stanKonta += wartosc;
    }
    public void wykonajWypłatę(Double wartosc){
        this.stanKonta += wartosc;
    }
    public void zróbOperację(OperacjaBankowa operacjaBankowa){
        operacjaBankowa.wykonaj();
    }

}
