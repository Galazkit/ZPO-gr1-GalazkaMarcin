package Lab11.zad3;

public class sprawdźStanAutoryzacji implements Stan {
    Autoryzacja authorization;
    String login = "login";
    String password = "password";
    int próby = 0;

    public sprawdźStanAutoryzacji(Autoryzacja authorization){
        this.authorization = authorization;
    }

    public void checkAuthorization(String login, String password) {
        if(login == this.login && password == this.password){
            authorization.setStan(authorization.AutoryzacjaPoprawna());
            próby = 0;
        } else if ((login == this.login || password == this.password) && próby < 2){
            authorization.setStan(authorization.AutoryzacjaNiePoprawna());
            próby++;
        } else {
            authorization.setStan(authorization.AutoryzacjaNie3xPoprawna());
        }
    }
}
