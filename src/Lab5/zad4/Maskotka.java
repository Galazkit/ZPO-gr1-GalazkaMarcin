package Lab5.zad4;

public class Maskotka extends OrderDecorator {
    public Maskotka(OrderItem newItem) {
        super(newItem);
        System.out.println("Dodaj maskotkę");
    }

    public String getDescription(){
        return item.getDescription() + ", Maskotka";
    }

    public double getCost(){
        return item.getCost();
    }

}
