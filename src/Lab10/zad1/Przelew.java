package Lab10.zad1;

public class Przelew implements OperacjaBankowa{
    Konto odKogo;
    Konto DoKogo;
    Double wartosc;

    public Przelew(Konto odKogo, Konto DoKogo, Double wartosc){
        this.odKogo = odKogo;
        this.DoKogo = DoKogo;
        this.wartosc = wartosc;
    }

    public void wykonaj(){
        odKogo.wykonajWypłatę(wartosc);
        DoKogo.wykonajWpłatę(wartosc);
    }
}
