package Lab2.zad3;

public class RifleMan extends Unit{
    public RifleMan(){
        this.weapon = new Rifle();
    }
    public void display(){
        System.out.println("RifleMan");
    }
    public void kindOfWeapon(){
        this.weapon.usedweapon();
    }
}
