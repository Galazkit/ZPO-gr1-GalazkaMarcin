package Lab2.zad1;

public class MallardDuck extends Duck{
    public MallardDuck(String name){
        super(name);
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();

    }
    public void display(){
        System.out.println("MallardDuck");
    }
}
