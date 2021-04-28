package Lab4.zad2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Interest interestA = new InterestA();
        Interest interestB = new InterestB();
        Interest interestC = new InterestC();

        Account account1 = new Account(100, interestA);
        Account account2 = new Account(200, interestB);
        Account account3 = new Account(300, interestC);

        bank.addClient(account1);
        bank.addClient(account2);
        bank.addClient(account3);

        account1.doOperation(new Income(account1, 500.0));
        account1.doOperation(new Transfer(account1, account3, 250.0));

        account1.doCompute();

    }
}
