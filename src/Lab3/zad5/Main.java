package Lab3.zad5;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.addCompany("Mlekpol",500.0);
        market.addCompany("Maxim",250.0);

        ActionMarket actionMarket1 = new Klient(market,"Henry","Bonżur",2000.0);
        ActionMarket actionMarket2 = new Klient(market,"Jan","Kowalczyk",3500.0);

        market.changeCompanyValue("Mlekpol",200.0);

        actionMarket1.sellActions(2,"Maxim");
        actionMarket2.buyActions(3,"Mlekpol");
    }
}