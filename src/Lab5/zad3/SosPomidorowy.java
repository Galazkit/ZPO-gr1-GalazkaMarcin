package Lab5.zad3;

public class SosPomidorowy extends PizzaDecorator {

    public SosPomidorowy(Pizza newPizza) {
        super(newPizza);
        System.out.println("dodano sos pomidorowy");
    }

    public String getDescription(){
        return stack.getDescription() + ",sos pomidorowy";
    }

    public double getCost(){
        return stack.getCost() + 0.99;
    }

}