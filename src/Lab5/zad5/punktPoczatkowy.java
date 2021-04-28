package Lab5.zad5;

public class punktPoczatkowy extends DrukarkaSettings {

    public punktPoczatkowy(int x, int y, int zasobnikTuszu) {
        super(null, x, y);
        this.zasobnikTuszu = zasobnikTuszu;
        ustalPozycje(x,y);
    }

    @Override
    public String historiaAkcji() {
        return "Punkt początkowy("+this.startX+", "+this.startY+", "+this.endX+", "+this.endY+")";
    }

    @Override
    public double getTusz() {
        return this.zasobnikTuszu;
    }

}