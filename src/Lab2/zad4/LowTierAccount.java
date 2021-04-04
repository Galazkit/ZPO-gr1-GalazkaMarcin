package Lab2.zad4;

public class LowTierAccount extends Account{
    public LowTierAccount(LanguageBehavior languageBehavior, double value){
        this. value = value;
        this.languageBehavior = languageBehavior;
        this.notificationBehavior = new MesEmail();
    }

    public void display(){
        System.out.println("LowTierAccount");
    }

    public void SendMess(){
        this.languageBehavior.language();
        this.notificationBehavior.kindOfMess();
    }
}
