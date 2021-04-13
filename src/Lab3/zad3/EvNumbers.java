package Lab3.zad3;

public class EvNumbers implements Observer{
    int value;

    @Override
    public void up(int value){
        if(value % 2 == 0){
            this.value = value;
            result();
        }
    }
    public void result(){
        System.out.println("EvNumbers " + this.value);
    }
}
