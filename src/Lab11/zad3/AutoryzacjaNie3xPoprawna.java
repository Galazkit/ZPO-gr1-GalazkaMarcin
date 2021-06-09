package Lab11.zad3;

import java.util.*;

public class AutoryzacjaNie3xPoprawna implements Stan {
    private Autoryzacja autoryzacja;
    private Long czas = -1l;

    public AutoryzacjaNie3xPoprawna(Autoryzacja autoryzacja) {
        this.autoryzacja = autoryzacja;
    }

    public void checkAuthorization(String login, String haslo) {
        GregorianCalendar gc = new GregorianCalendar();
        if (czas == -1l) {
            czas = gc.getTime().getTime();
        }
        if ((gc.getTime().getTime() - czas) >= 30000) {
            autoryzacja.setStan(autoryzacja.getCheckAuthorizationState());
            autoryzacja.getStan().checkAuthorization(login, haslo);
            czas = -1l;
            return;
        }
        System.out.println("3x źle, spróbuj za 30 sek.");
    }
}