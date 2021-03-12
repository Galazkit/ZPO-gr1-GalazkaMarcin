package Lab1.zad5;

public class Main {
    public static void main(String[] args){
        PolTax polTax = new PolTax();
        GBTax gbTax = new GBTax();
        GTax gTax = new GTax();
        Shop shop = new Shop(polTax);
        System.out.println(shop.tax.CTax(100.0D));
        shop.ChangeTax(gbTax);
        System.out.println(shop.tax.CTax(100.0D));
        shop.ChangeTax(gTax);
        System.out.println(shop.tax.CTax(100.0D));
    }
}
