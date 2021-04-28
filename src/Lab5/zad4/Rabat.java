package Lab5.zad4;

public class Rabat extends OrderDecorator {
    public Rabat(OrderItem newItem) {
        super(newItem);
        System.out.println("Dodaj rabat");
    }

    public String getDescription(){
        return item.getDescription() + ", Rabat";
    }

    public double getCost(){
        return item.getCost() - 10.00;
    }

}
