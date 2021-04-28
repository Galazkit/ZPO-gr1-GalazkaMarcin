package Lab6.zad2;

public class CiezarowkaFabryka extends BazowaFabryka {
    @Override
    protected IDostarcz sposobTransportu() {
        return new Ciezarowka();
    }
}
