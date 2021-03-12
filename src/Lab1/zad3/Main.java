package Lab1.zad3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new Szybki(), "Trabant");

        car1.showCarName();
        car1.printMaxSpeed();

        Car car2 = new Car(new Wolny(),"Seicento");
        car2.showCarName();
        car2.printMaxSpeed();
    }
}
