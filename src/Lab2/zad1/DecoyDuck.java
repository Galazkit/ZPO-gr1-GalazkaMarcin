package Lab2.zad1;

public class DecoyDuck extends Duck{
    public DecoyDuck(String name){
        super(name);
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();

    }
    public void display(){
        System.out.println("Decou Duck");
    }
}
