package Lab5.zad3;

public class Main {
    public static void main(String[] args) {

        PizzaDecorator Pizzaa = new Pizzaa();
        PizzaDecorator SosPomidorowy = new SosPomidorowy(Pizzaa);
        PizzaDecorator Vegetables = new Vegetables(SosPomidorowy);

        System.out.println("skład: " + Vegetables.getDescription());
        System.out.println("cena: " + Vegetables.getCost());

        Vegetables.removeDecorator(SosPomidorowy);

        System.out.println("skład: " + Vegetables.getDescription());
        System.out.println("Price: " + Vegetables.getCost());

    }
}
