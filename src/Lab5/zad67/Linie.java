package Lab5.zad67;

public class Linie extends SterownikDecorator {

    public Linie(SterownikDecorator action, int x, int y) {
        super(action, x, y);
    }

    public String historiaAkcji(){
        String PI = "\n"+this.startX+", "+this.startY+", "+this.endX+", "+this.endY;
        if(action.sprawdzIlosc() == 0) {
            return action.historiaAkcji() + ", " +PI +" -> brak tuszu!";
        } else if (action.sprawdzIlosc() < 30){
            return action.historiaAkcji() + ", " +PI +" -> mało tuszu!";
        } else {
            return action.historiaAkcji() + ", " +PI;
        }
    }

    public int calculateDistance(){
        return (int) Math.sqrt((endX-startX)*(endX-startX) + (endY-startY)*(endY-startY));
    }

    public int sprawdzIlosc(){
        int distance = calculateDistance();
        if(action.sprawdzIlosc() - distance < 0){
            return 0;
        } else {
            return action.sprawdzIlosc() - distance;
        }
    }

}
