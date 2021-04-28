package Lab5.zad4;

public class Smyczka extends OrderDecorator {
    public Smyczka(OrderItem newItem) {
        super(newItem);
        System.out.println("Dodaj smyczkę");
    }

    public String getDescription(){
        return item.getDescription() + ", Smyczka";
    }

    public double getCost(){
        return item.getCost() + 1.00;
    }

}