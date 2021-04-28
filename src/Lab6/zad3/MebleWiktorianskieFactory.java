package Lab6.zad3;

public class MebleWiktorianskieFactory implements IAbstractFactory {
    @Override
    public Fotel dodajFotel() {
        return new FotelWiktorianski();
    }

    @Override
    public Sofa dodajSofe() {
        return new SofaWiktorianska();
    }

    @Override
    public StolikKawowy dodajStolikKawowy() {
        return new StolikKawowyWiktorianski();
    }
}
