package Lab3.zad5;

public class Klient extends ActionMarket {
    private String surname;

    public Klient(Market market, String name, String surname, Double balance){
        super(market,name, balance);
        this.surname = surname;
        market.set(this);
    }
    @Override
    public void buyActions(int amount, String company){
        double value = getValueByCompany(company);
        if(value * amount < this.getBalance()){
            System.out.println("Kupiłem akcje: " + company);
            System.out.println("Za: " + value);
            System.out.println("Ilość: " + amount);
            System.out.println("Całościowo zapłacę: " + (value*amount));

        } else {
            System.out.println("Nie kupuję");
        }
    }

    @Override
    public void sellActions(int amount, String company){
        double value = getValueByCompany(company);
        System.out.println("Sprzedałem akcje: " + company);
        System.out.println("Za: " + value);
        System.out.println("Ilość: " + amount);
        System.out.println("Całościowo zapłacę: " + (value*amount));
    }

}
