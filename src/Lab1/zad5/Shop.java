package Lab1.zad5;

public class Shop {
    Tax tax;

    public Shop(Tax tax){
        this.tax = tax;
    }

    public void ChangeTax(Tax tax){
        this.tax = tax;
    }
}
