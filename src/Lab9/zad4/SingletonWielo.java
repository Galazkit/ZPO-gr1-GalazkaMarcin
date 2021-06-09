package Lab9.zad4;

public class SingletonWielo{

    private static SingletonWielo instance;

    //zsynchronizowana metoda getInstance z "blokadą podwójnego zatwierdzenia"
    public static SingletonWielo getInstance() {
        if (instance == null) {
            synchronized (SingletonWielo.class) {
                if (instance == null) {
                    instance = new SingletonWielo();
                }
            }
        }
        return instance;
    }
}
