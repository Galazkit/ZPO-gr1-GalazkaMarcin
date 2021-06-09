package Lab8.zad4;

public abstract class Pizza {
    abstract void przygotujCiasto();
    abstract void dodajSos();
    abstract void dodajDodatki();
    abstract void dodajPrzyprawy();
    abstract void pieczPizze();

    public final void przygotuj(){
        przygotujCiasto();
        dodajSos();
        dodajDodatki();
        dodajPrzyprawy();
        pieczPizze();

    }

}
