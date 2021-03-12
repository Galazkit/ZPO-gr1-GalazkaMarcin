package Lab1.zad6;

public class Pracownik {
    public Pracowac pracowac;
    public Dojezdzac dojezdzac;
    public SpendzanieWolnegoCzasu spendzanieWolnegoCzasu;
    public String zawod;

    public Pracownik(String zawod, Pracowac pracowac, Dojezdzac dojezdzac, SpendzanieWolnegoCzasu spendzanieWolnegoCzasu){
        this.zawod = zawod;
        this.pracowac = pracowac;
        this.dojezdzac = dojezdzac;
        this.spendzanieWolnegoCzasu = spendzanieWolnegoCzasu;
    }

    public void Zawod() {
        System.out.println(this.zawod);
    }
}
