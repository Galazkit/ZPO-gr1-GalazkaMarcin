package Lab1.zad4;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("Red Head Duck");
    }
}
