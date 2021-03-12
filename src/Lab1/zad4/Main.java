package Lab1.zad4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RedHeadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());

        Iterator duckIterator = ducks.iterator();

        while (duckIterator.hasNext()){
            Duck duck = (Duck)duckIterator.next();
            System.out.println("----------------------------");
            duck.display();
            duck.kindOfFly();
            duck.kindOfQuack();
            System.out.println("----------------------------");
        }
        ducks.get(1).setFlyBehavior(new FlyWithRocket());

        ducks.get(1).display();
        ducks.get(1).kindOfFly();
        ducks.get(1).kindOfQuack();

    }
}
