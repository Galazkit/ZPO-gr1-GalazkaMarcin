package Lab5.zad3;

public class Vegetables extends PizzaDecorator {

    public Vegetables(Pizza newPizza) {
        super(newPizza);
        System.out.println("dodano warzywa");
    }

    public String getDescription(){
        return stack.getDescription() + ", warzywa";
    }

    public double getCost(){
        return stack.getCost() + 1.50;
    }

}
