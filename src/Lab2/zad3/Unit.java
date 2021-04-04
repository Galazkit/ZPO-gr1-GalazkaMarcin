package Lab2.zad3;

public abstract class Unit {
    Weapon weapon;

    abstract void display();
    abstract void kindOfWeapon();

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
