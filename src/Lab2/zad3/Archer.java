package Lab2.zad3;

public class Archer extends Unit{
    public Archer(){
        this.weapon = new Bow();
    }
    public void display(){
        System.out.println("Archer");
    }

    public void kindOfWeapon(){
        this.weapon.usedweapon();
    }
}
