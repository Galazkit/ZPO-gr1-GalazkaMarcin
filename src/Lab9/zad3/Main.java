package Lab9.zad3;

public class Main {
    public static void main(String[] args) {
        String[] mscs = {"Styczeń", "Luty",
                "Marzec", "Kwiecień", "Maj", "Czerwiec",
                "Lipiec", "Sierpień", "Wrzesień", "Październik",
                "Listopad", "Grudzień"};

        for (String msc : mscs) {
            System.out.println(msc + ":" + Finanse.getInstance(msc).getValue());
        }
    }
}