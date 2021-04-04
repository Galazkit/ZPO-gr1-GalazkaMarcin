package Lab2.zad4;

public class HighTierAccount extends Account {
    public HighTierAccount(LanguageBehavior languageBehavior, double value){
        this. value = value;
        this.languageBehavior = languageBehavior;
        this.notificationBehavior = new MesVoice();
    }

    public void display(){
        System.out.println("MiddleTierAccount");
    }

    public void SendMess(){
        this.languageBehavior.language();
        this.notificationBehavior.kindOfMess();
    }
}
