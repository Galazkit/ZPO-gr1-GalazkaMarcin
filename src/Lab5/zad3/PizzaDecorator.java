package Lab5.zad3;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza stack;

    public PizzaDecorator(Pizza newPizza) {
        this.stack = newPizza;
    }

    public void removeDecorator(PizzaDecorator toRemove) {
        if (stack == null) {
            return;
        } else if (stack.equals(toRemove)) {
            stack = stack.getSubject();
        } else {
            stack.removeDecorator(toRemove);
        }
    }

    public String getDescription() {
        return stack.getDescription();
    }

    public double getCost() {
        return stack.getCost();
    }

    public Pizza getSubject() {
        return stack;
    }
}

