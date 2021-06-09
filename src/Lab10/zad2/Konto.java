package Lab10.zad2;

public class Konto implements Obserwator{
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

    @Override
    public void update(String mess) {
        System.out.println("Otrzymałem wiadomośc");
        System.out.println(mess);
    }

}