package Lab6.zad2;

public class Statek implements IDostarcz {
    @Override
    public void dostarcz(String ladunek) {
        System.out.println("Statek dostarczy: " + ladunek);
    }
}
