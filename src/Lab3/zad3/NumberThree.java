package Lab3.zad3;

public class NumberThree implements Observer{
    int value;

    @Override
    public void up(int value){
        if(value == 3){
            this.value = value;
            result();
        }
    }
    public void result(){
        System.out.println("NumberThree wykrył " + this.value);
    }
}
