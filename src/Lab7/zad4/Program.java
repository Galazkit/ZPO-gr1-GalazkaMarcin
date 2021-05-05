package Lab7.zad4;

import java.util.Arrays;

public class Program {
    String text;
    String[] operations;
    CzcionkaFasada czcionkaFasada;

    public Program(String[] args){
        if(args.length > 0){
            this.text = args[0];
            this.operations = subArray(args, 1, args.length);
            this.czcionkaFasada = new CzcionkaFasada();
        }
    }
    public static<T> T[] subArray(T[] array, int beg, int end) {
        return Arrays.copyOfRange(array, beg, end);
    }
    public void exec(){
        System.out.println(text);
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("pogrubienie")){
                czcionkaFasada.useBold(text);
            } else if (operations[i].equals("arial")){
                czcionkaFasada.useItalic(text);
            }
        }
    }

}

