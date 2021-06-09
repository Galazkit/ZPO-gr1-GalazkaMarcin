package Lab11.zad3;

class Autoryzacja {
    private Stan AutoryzacjaNiePoprawna;
    private Stan AutoryzacjaNie3xPoprawna;
    private Stan AutoryzacjaPoprawna;
    private Stan sprawdźStanAutoryzacji;
    private Stan state;

    public Autoryzacja() {
        this.AutoryzacjaNiePoprawna = new AutoryzacjaNiePoprawna(this);
        this.AutoryzacjaNie3xPoprawna = new AutoryzacjaNie3xPoprawna(this);
        this.AutoryzacjaPoprawna = new AutoryzacjaPoprawna(this);
        this.sprawdźStanAutoryzacji = new sprawdźStanAutoryzacji(this);
        this.state = this.sprawdźStanAutoryzacji;
    }

    public void setStan(Stan $objStan) {
        this.state = $objStan;
    }

    public Stan getStan() {
        return this.state;
    }

    public void sprawdźStanAutoryzacji(String login, String password) {
        this.state.checkAuthorization(login, password);
    }

    public Stan getCheckAuthorizationState() {
        return this.sprawdźStanAutoryzacji;
    }

    public Stan AutoryzacjaNiePoprawna() {
        return this.AutoryzacjaNiePoprawna;
    }

    public Stan AutoryzacjaNie3xPoprawna() {
        return this.AutoryzacjaNie3xPoprawna;
    }

    public Stan AutoryzacjaPoprawna() {
        return this.AutoryzacjaPoprawna;
    }
}
