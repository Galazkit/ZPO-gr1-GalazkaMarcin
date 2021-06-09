package Lab11.zad3;

public class Main {
    public static void main(String[] args) {
        Autoryzacja auth = new Autoryzacja();
        auth.sprawdźStanAutoryzacji("test", "password");

        System.out.println(auth.getStan());
    }
}