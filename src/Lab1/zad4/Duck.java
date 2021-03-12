package Lab1.zad4;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    public void swim(){
        System.out.println("swim, swim!!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void kindOfFly(){
        this.flyBehavior.fly();
    }

    public void kindOfQuack(){
        this.quackBehavior.quack();
    }
}
