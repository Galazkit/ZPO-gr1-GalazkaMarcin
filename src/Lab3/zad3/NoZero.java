package Lab3.zad3;

public class NoZero implements Observer{
    int value;

    @Override
    public void up(int value){
        if(value > 0){
            this.value = value;
            result();
        }
    }
    public void result(){
        System.out.println("NoZero wykrył " + this.value);
    }
}
