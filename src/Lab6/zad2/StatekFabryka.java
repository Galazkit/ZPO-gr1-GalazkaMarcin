package Lab6.zad2;

public class StatekFabryka extends BazowaFabryka {
    @Override
    protected IDostarcz sposobTransportu() {
        return new Statek();
    }
}
