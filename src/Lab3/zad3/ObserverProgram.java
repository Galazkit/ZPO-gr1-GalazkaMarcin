package Lab3.zad3;

import java.util.ArrayList;

public class ObserverProgram implements Observer_State {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int value;

    public void addValue(int value){
        this.value = value;
        notification();
    }

    public void select(int value){
        if(value == 1) set(new NoZero());
        if(value == 2) set(new NumberThree());
        if(value == 3) set(new EvNumbers());
    }

    public void set(Observer newObs){
        observers.add(newObs);
    }
    public void unset(Observer deleteObserver){
        observers.remove(deleteObserver);
    }
    public void notification(){
        for(Observer observer : observers){
            observer.up(value);
        }
    }
}
