package Lab5.zad4;

public class Transport extends OrderDecorator {
    public Transport(OrderItem newItem) {
        super(newItem);
        System.out.println("Koszt transportu");
    }

    public String getDescription(){
        return item.getDescription() + ", Transport";
    }

    public double getCost(){
        return item.getCost() + 13.00;
    }

}
