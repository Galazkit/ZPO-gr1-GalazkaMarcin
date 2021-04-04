package Lab2.zad3;

public class Cannoner extends Unit{
    public Cannoner(){
        this.weapon = new Cannon();
    }
    public void display(){
        System.out.println("Cannoner");
    }

    public void kindOfWeapon(){
        this.weapon.usedweapon();
    }
}
