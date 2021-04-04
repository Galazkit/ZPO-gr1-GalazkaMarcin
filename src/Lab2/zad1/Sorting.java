package Lab2.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    SortBehavior sortBehavior;

    public Sorting(SortBehavior sortBehavior){
        this.sortBehavior = sortBehavior;
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    public ArrayList<Duck> sort(ArrayList<Duck> arrayList){
        return this.sortBehavior.Sort(arrayList);
    }

    public ArrayList<Duck> rand(ArrayList<Duck> arrayList){
        Collections.shuffle(arrayList);
        return arrayList;
    }
    public void print(ArrayList<Duck> arrayList){
        for(Duck duck : arrayList){
            duck.printName();
        }
    }

    public Duck[] sort(Duck[] array){
        return this.sortBehavior.Sort(array);
    }
    public Duck[] rand(Duck[] array){
        List<Duck> arrayList = Arrays.asList(array);
        Collections.shuffle(arrayList);
        return arrayList.toArray(array);
    }
    public void print(Duck[] array){
        for(Duck duck : array){
            duck.printName();
        }
    }
}
