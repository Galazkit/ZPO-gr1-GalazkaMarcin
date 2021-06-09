package Lab4.zad2;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance = 0.0;
    private double intrestValue = 0.0;
    private List<Operation> operations = new ArrayList<Operation>();
    private Interest interest;

    public Account(double balance, Interest interest){
        this.balance = balance;
        this.interest = interest;
    }
    public void doOperation(Operation o){
        o.execute();
    }
    public void changeIntrest(Interest intrest){
        this.interest = intrest;
    }

    public void addToBalance(Double value){
        this.balance += value;
    }
    public void subtractFromBalance(Double value){
        this.balance += value;
    }

    public void doCompute(){
        this.interest.compute();
    }

}