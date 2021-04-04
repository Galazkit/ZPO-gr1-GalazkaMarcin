package Lab2.zad3;

public class Main {
    public static void main(String[] args) {
        Archer  archer = new Archer();
        SwordsMan swordsMan = new SwordsMan();
        RifleMan rifleMan = new RifleMan();
        Cannoner cannoner = new Cannoner();

        System.out.println("---------------------------");
        archer.display();
        archer.kindOfWeapon();
        System.out.println("---------------------------");
        swordsMan.display();
        swordsMan.kindOfWeapon();
        System.out.println("---------------------------");
        rifleMan.display();
        rifleMan.kindOfWeapon();

    }
}
