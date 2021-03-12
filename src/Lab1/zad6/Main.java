package Lab1.zad6;

public class Main {
    public static void main(String[] args){
        SpendzanieWolnegoCzasu spendzanieWolnegoCzasu = new Silownia();
        Leczenie leczenie = new Leczenie();
        Rower rower = new Rower();
        String zawod = "Ordynator";
        Pracownik pracownik = new Pracownik(zawod,leczenie,rower,spendzanieWolnegoCzasu);

        pracownik.pracowac.pracuj();
        pracownik.spendzanieWolnegoCzasu.spendzajWolnyCzas();
        pracownik.dojezdzac.dojezdzaj();
        pracownik.Zawod();

    }
}
