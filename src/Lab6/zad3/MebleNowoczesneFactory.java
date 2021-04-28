package Lab6.zad3;

public class MebleNowoczesneFactory implements IAbstractFactory {
    @Override
    public Fotel dodajFotel() {
        return new FotelNowoczesny();
    }

    @Override
    public Sofa dodajSofe() {
        return new SofaNowoczesna();
    }

    @Override
    public StolikKawowy dodajStolikKawowy() {
        return new StolikKawowyNowoczesny();
    }
}