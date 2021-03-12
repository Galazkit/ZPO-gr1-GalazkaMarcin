package Lab1.zad4;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
    public void display(){
        System.out.println("Decou Duck");
    }
}
