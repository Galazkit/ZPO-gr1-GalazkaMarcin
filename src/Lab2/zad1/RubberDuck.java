package Lab2.zad1;

public class RubberDuck extends Duck{
    public RubberDuck(String name){
        super(name);
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();

    }
    public void display(){
        System.out.println("Rubber Duck");
    }
}
