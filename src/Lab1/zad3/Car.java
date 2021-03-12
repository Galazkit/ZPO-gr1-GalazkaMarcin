package Lab1.zad3;

public class Car {
    private CarSpeed carSpeed;
    private String name;

    public Car(CarSpeed carSpeed, String name) {
        this.carSpeed = carSpeed;
        this.name = name;
    }

    public void showCarName() {
        System.out.println(this.name);
    }

    public void printMaxSpeed() {
        System.out.println(this.carSpeed.GetMaxSpeed());
    }
}