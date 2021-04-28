package Lab5.zad5;

public class Linia extends DrukarkaSettings {

    public Linia(DrukareczkaInterface action, int x, int y) {
        super(action, x, y);
    }

    public String historiaAkcji(){
        String PI = "\n"+this.startX+", "+this.startY+", "+this.endX+", "+this.endY;
        if(action.getTusz() == 0) {
            return action.historiaAkcji() + ", " +PI +" -> brak tuszu!";
        } else if (action.getTusz() < 30){
            return action.historiaAkcji() + ", " +PI +" -> mało tuszu!";
        } else {
            return action.historiaAkcji() + ", " +PI;
        }
    }

    public int calculateDistance(){
        return (int) Math.sqrt((endX-startX)*(endX-startX) + (endY-startY)*(endY-startY));
    }

    public double getTusz(){
        int distance = calculateDistance();
        if(action.getTusz() - distance < 0){
            return 0;
        } else {
            return action.getTusz() - distance;
        }
    }

}