package Lab11.zad3;

public class AutoryzacjaNiePoprawna implements Stan {
    private Autoryzacja autoryzacja;
    public AutoryzacjaNiePoprawna(Autoryzacja autoryzacja) {
        this.autoryzacja = autoryzacja;
    }
    public void checkAuthorization(String login, String haslo) {
        System.out.println("Niepoprawny login lub hasło");
        autoryzacja.setStan(autoryzacja.getCheckAuthorizationState());
    }
}