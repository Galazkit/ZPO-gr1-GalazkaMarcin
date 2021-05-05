package Lab7.zad4;

public class CzcionkaFasada {
    private Czczionka pogrubienie;
    private Czczionka arial;

    public CzcionkaFasada() {
        pogrubienie = new Pogrubienie();
        arial = new Arial();
    }

    public void useBold(String text){
        pogrubienie.czcionka(text);
    }
    public void useItalic(String text){
        arial.czcionka(text);
    }
}
