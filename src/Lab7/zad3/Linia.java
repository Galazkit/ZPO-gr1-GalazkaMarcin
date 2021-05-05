package Lab7.zad3;

public class Linia implements Kształt {

    @Override
    public void rysuj(int startX, int startY, int endX, int endY) {
        System.out.println("Linia od("+startX+","+startY+") do ("+endX+","+endY+")");
    }
}
