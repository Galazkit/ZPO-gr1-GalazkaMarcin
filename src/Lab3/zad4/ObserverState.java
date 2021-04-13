package Lab3.zad4;

import java.util.ArrayList;

public class ObserverState {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void update() {
        for (Observer o : this.observers) {
            o.update(this);
        }
    }

    public void update(Object o) {
        for (Observer observer : this.observers) {
            observer.update(o);
        }
    }

    public void subscribe(Observer o) {
        if (!this.observers.contains(o)) {
            this.observers.add(o);
        }
    }

    public void unsubscribe(Observer o) {
        if (this.observers.contains(o)) {
            this.observers.remove(o);
        }
    }
}
