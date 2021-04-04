package Lab2.zad4;

public abstract class Account {
    LanguageBehavior languageBehavior;
    NotificationBehavior notificationBehavior;
    double value;

    public abstract void display();
    public abstract void SendMess();

    public void ChangeLanguage(LanguageBehavior languageBehavior){
        this.languageBehavior = languageBehavior;
    }
}
