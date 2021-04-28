package Lab6.zad2;

public class SamolotFabryka extends BazowaFabryka {
    @Override
    protected IDostarcz sposobTransportu() {
        return new Samolot();
    }
}