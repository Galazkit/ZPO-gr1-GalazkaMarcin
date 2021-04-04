package Lab2.zad2;

public class Main {
    public static void main(String[] args){
        DD dd = new DD();
        DPL dpl = new DPL();

        SoundSystem soundSystem = new SoundSystem(10);
        soundSystem.SelectCodec();
        soundSystem.SoundSystemDetail();

        SoundSystem soundSystem1 = new SoundSystem(60);
        soundSystem1.SelectCodec();
        soundSystem1.SoundSystemDetail();
    }
}
