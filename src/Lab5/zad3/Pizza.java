package Lab5.zad3;

public interface Pizza {
    public String getDescription();
    public double getCost();
    public void removeDecorator(PizzaDecorator toRemove);
    public Pizza getSubject();
}