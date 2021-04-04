package Lab2.zad4;

public class MiddleTierAccount extends Account{
    public MiddleTierAccount(LanguageBehavior languageBehavior, double value){
        this. value = value;
        this.languageBehavior = languageBehavior;
        this.notificationBehavior = new MesSMS();
    }

    public void display(){
        System.out.println("MiddleTierAccount");
    }

    public void SendMess(){
        this.languageBehavior.language();
        this.notificationBehavior.kindOfMess();
    }
}
