package Lab3.zad5;

import java.util.ArrayList;

public class Market implements ObserverState{
    private ArrayList<Observer> observers;
    private ArrayList<String> Companies = new ArrayList<String>();
    private ArrayList<Double> Values  = new ArrayList<Double>();

    public Market(){
        observers = new ArrayList<Observer>();
    }

    public void addCompany(String name, double value) {
        this.Companies.add(name);
        this.Values.add(value);
        notification();
    }

    public void removeCompany(String name) {
        int index = Companies.indexOf(name);
        Companies.remove(index);
        Values.remove(index);
        notification();
    }

    public void changeCompanyValue(String name, double value){
        int index = Companies.indexOf(name);
        Values.set(index,value);
        notification();
    }

    @Override
    public void set(Observer newObserver){
        observers.add(newObserver);
    }

    @Override
    public void unset(Observer deleteObserver){
        observers.remove(deleteObserver);
    }

    @Override
    public void notification(){
        for(Observer observer : observers){
            observer.update(Companies, Values);
        }
    }
}
