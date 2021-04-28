package Lab6.zad1;

public class AwizoFabryka extends PocztaFabryka {
    @Override
    protected IDostarcz uslugaDostarczaniaPaczek() {
        return new Awizo();
    }
}
