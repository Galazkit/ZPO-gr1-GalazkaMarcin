package Lab4.zad2;

public class IntrestChange implements Operation{
    Account account;
    Interest instest;

    public IntrestChange(Account account, Interest intrest){
        this.account = account;
        this.instest = intrest;
    }

    public void execute(){
        account.changeIntrest(instest);
    }
}
