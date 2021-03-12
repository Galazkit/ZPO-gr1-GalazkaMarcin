package Lab1.zad4;

public class RubberDuck extends Duck{
    public RubberDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }
    public void display(){
        System.out.println("Rubber Duck");
    }
}
