package Lab5.zad5;

public abstract class DrukarkaSettings implements DrukareczkaInterface {
    protected DrukareczkaInterface action;

    int startX;
    int startY;
    int endX;
    int endY;
    int zasobnikTuszu;

    public DrukarkaSettings(DrukareczkaInterface drukareczkaInterface, int x, int y){
        this.action = drukareczkaInterface;
        rysujDo(x,y);
    }

    public void ustalPozycje(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    public void rysujDo(int x, int y) {
        this.endX = x;
        this.endY = y;
    }

    public String historiaAkcji(){
        return action.historiaAkcji();
    }

    public double getTusz(){
        return action.getTusz();
    }

}
