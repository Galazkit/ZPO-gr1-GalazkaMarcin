package Lab5.zad4;

public class OrderBase extends OrderDecorator{
    double baseOrderValue;

    public OrderBase(double value) {
        super(null);
        this.baseOrderValue = value;
        System.out.println("dodaj zamówienie");
    }

    @Override
    public String getDescription() {
        return "podstawowe zamówinie";
    }

    @Override
    public double getCost() {
        return this.baseOrderValue;
    }
}