package Lab2.zad1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
   /*   ArrayList<Duck> ducks = new ArrayList<>();
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
*/
        Duck[] ducksArray = new Duck[4];
        ducksArray[0] = new MallardDuck("MallardDuck");
        ducksArray[1] = new RedHeadDuck("RedHeadDuck");
        ducksArray[2] = new DecoyDuck("DecoyDuck");
        ducksArray[3] = new RubberDuck("RubberDuck");

        ducksArray[1].setFlyBehavior(new FlyWithRocket());

        ArrayList<Duck> ducksList = new ArrayList();
        ducksList.add(new MallardDuck("MallardDuck"));
        ducksList.add(new RedHeadDuck("RedHeadDuck"));
        ducksList.add(new DecoyDuck("DecoyDuck"));
        ducksList.add(new RubberDuck("RubberDuck"));

        ducksList.get(1).setFlyBehavior(new FlyWithRocket());

        BubbleSort bubble = new BubbleSort();

        Sorting sorting = new Sorting(bubble);

        sorting.print(ducksList);
        System.out.println("-------------------");
        sorting.sort(ducksList);
        sorting.print(ducksList);
        System.out.println("-------------------");
        sorting.print(ducksArray);
        System.out.println("-------------------");
        sorting.sort(ducksArray);
        sorting.print(ducksArray);
    }
}
