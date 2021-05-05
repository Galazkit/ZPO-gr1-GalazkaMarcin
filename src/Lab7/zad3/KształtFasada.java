package Lab7.zad3;

public class KształtFasada {
    private Kształt prostokąt;
    private Kształt linia;

    public KształtFasada() {
        prostokąt = new Prostokąt();
        linia = new Linia();
    }

    public void rysujProstokąt(int startX, int startY, int width, int height){
        prostokąt.rysuj(startX,startY,width,height);
    }
    public void rysujLinię(int startX, int startY, int endX, int endY){
        linia.rysuj(startX,startY,endX,endY);
    }
}
