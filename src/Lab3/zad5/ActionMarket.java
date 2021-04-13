package Lab3.zad5;

import java.util.ArrayList;

public abstract  class ActionMarket implements Observer{
    private ArrayList<String> Companies = new ArrayList<String>();
    private ArrayList<Double> Values  = new ArrayList<Double>();

    private String name;
    private ObserverState ObserverState;
    private Double balance;


    public ActionMarket(ObserverState ObserverState, String name, Double balance){
        this.ObserverState = ObserverState;
        this.name = name;
        this.balance = balance;
    }
    @Override
    public void update(ArrayList<String> Companies, ArrayList<Double>Values) {
        this.Companies = Companies;
        this.Values = Values;
        printPrices();
    }

    public ArrayList<Double> getValues(){
        return Values;
    }

    public Double getBalance(){
        return this.balance;
    }

    public Double getValueByCompany(String company){
        int index = Companies.indexOf(company);
        return Values.get(index);
    }

    public abstract void buyActions(int amount, String company);

    public abstract void sellActions(int amount, String company);


    public void printPrices(){
        System.out.println(name);
        System.out.println(Companies);
        System.out.println(Values);
    }
}