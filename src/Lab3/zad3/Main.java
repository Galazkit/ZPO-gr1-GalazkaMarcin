package Lab3.zad3;

import java.util.Scanner;

public class Main {
    public static void start(){
        System.out.println("Wybierz jakie liczby ma obserwować program: ");
        System.out.println("1. Większe od 0.");
        System.out.println("2. Równe 3");
        System.out.println("3. Podzielne przez 2");
        System.out.println("Wprowadź wybraną liczbę: ");
    }
    public static void selected(int value){
        System.out.println("Wybrałeś " + value);
    }

    public static int getNumber(int value){
        Scanner sc= new Scanner(System.in);
            value = sc.nextInt();
        return value;
    }

    public static void main(String[] args) {

        ObserverProgram observerProgram = new ObserverProgram();
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        start();
        value = getNumber(value);
        observerProgram.select(value);
        selected(value);
        while(true){
            value = scanner.nextInt();
            observerProgram.addValue(value);
        }
    }
}
