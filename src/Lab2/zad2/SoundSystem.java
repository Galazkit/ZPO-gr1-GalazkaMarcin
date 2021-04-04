package Lab2.zad2;

public class SoundSystem {

    SoundCodec soundCodec;
    int volume;

    public SoundSystem(int volume){
        this.volume = volume;
    }

    public void SoundSystemDetail(){
        this.soundCodec.codec();
    }
    public void SelectCodec(){
        if(volume <=50){
            this.soundCodec = new DD();
        }else{
            this.soundCodec = new DPL();
        }
    }
}
