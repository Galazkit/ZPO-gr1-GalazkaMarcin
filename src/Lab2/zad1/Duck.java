package Lab2.zad1;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    String name;

    abstract void display();

    public Duck(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void printName(){
        System.out.println(this.name);
    }

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
