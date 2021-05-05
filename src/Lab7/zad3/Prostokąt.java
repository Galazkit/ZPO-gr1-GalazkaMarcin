package Lab7.zad3;

public class Prostokąt implements Kształt {

    @Override
    public void rysuj(int startX, int startY, int width, int height) {
        System.out.println("Prostokąt od("+startX+","+startY+") z szerokoscią=" + width + " i wysokoscią="+height);
    }
}
