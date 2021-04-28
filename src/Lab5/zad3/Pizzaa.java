package Lab5.zad3;

public class Pizzaa extends PizzaDecorator{

    public Pizzaa() {
        super(null);
        System.out.println("dodano pizzę");
    }

    @Override
    public String getDescription() {
        return "pizza";
    }

    @Override
    public double getCost() {
        return 10.00;
    }

}
