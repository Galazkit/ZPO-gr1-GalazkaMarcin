package Lab9.zad3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Finanse {

    private final String name;
    private final double value;
    private static Map<String, Finanse> val;

    static {
        val = new ConcurrentHashMap<>();
        try {
            String url = Finanse.class.getResource("dane.txt").toString().substring(8);
            //String url = Finanse.class.getResource("dane.txt").toString();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(url));
            String ln;
            while ((ln = bufferedReader.readLine()) != null) {
                String[] pair = ln.split(":");
                val.put(pair[0], new Finanse(pair[0], Double.parseDouble(pair[1])));
            }
        }
        catch(IOException e){ }
    }

    private Finanse(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public static Finanse getInstance(String name) {
        return val.get(name);
    }

    public double getValue() {
        return value;
    }

}