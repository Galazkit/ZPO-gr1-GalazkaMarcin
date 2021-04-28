package Lab6.zad1;

public class KurierFabryka extends PocztaFabryka {
    @Override
    protected IDostarcz uslugaDostarczaniaPaczek() {
        return new Kurier();
    }
}
