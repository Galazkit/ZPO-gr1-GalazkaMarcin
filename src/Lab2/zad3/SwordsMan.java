package Lab2.zad3;

public class SwordsMan extends Unit{
    public SwordsMan(){
        this.weapon = new Sword();
    }
    public void display(){
        System.out.println("SwordMan");
    }

    public void kindOfWeapon(){
        this.weapon.usedweapon();
    }
}
