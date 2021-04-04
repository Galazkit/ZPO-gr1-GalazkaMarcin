package Lab2.zad4;

public class Main {
    public static void main(String[] args)   {
        EnglandLanguage englandLanguage =  new EnglandLanguage();
        PolishLanguage polishLanguage = new PolishLanguage();

        LowTierAccount lowTierAccount = new LowTierAccount(polishLanguage,500);
        MiddleTierAccount middleTierAccount = new MiddleTierAccount(polishLanguage,1500);
        HighTierAccount highTierAccount = new HighTierAccount(englandLanguage,4000);

        lowTierAccount.SendMess();
        System.out.println("----------------------");
        middleTierAccount.SendMess();
        System.out.println("----------------------");
        highTierAccount.SendMess();
    }
}
