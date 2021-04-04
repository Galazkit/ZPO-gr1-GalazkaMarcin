package Lab2.zad1;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(String name){
        super(name);
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();

    }
    public void display(){
        System.out.println("Red Head Duck");
    }
}
