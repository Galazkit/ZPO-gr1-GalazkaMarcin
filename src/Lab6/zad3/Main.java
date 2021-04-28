package Lab6.zad3;

public class Main {

    public static void main(String[] args) {
        IAbstractFactory mobleWiktorianskie = new MebleWiktorianskieFactory();
        IAbstractFactory mebleNowoczesne = new MebleNowoczesneFactory();
        IAbstractFactory mebleArtDeco = new MebleArtDecoFactory();

        Klient klient = new Klient(mebleArtDeco);
        klient.wyswietlMeble();
        klient.zmienStylMebli(mebleNowoczesne);
        klient.wyswietlMeble();


    }
}
