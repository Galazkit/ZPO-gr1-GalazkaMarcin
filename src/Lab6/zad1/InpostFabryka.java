package Lab6.zad1;

public class InpostFabryka extends PocztaFabryka {
    @Override
    protected IDostarcz uslugaDostarczaniaPaczek() {
        return new Inpost();
    }
}