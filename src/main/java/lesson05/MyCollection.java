package lesson05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MyCollection {
    public static void main(String[] args) {
        ArrayList<String> bands = new ArrayList<String>();
        bands.add("Iron Maiden");
        bands.add("Manowar");
        bands.add("Helloween");
        bands.add("Gamma Ray");
        bands.add("Judas Priest");
        bands.add("Metallica");
//        System.out.println(bands);
        bands.remove("Manowar");
        ArrayList<String> bands1 = new ArrayList<String>(bands);
        System.out.println(bands);
        Collections.sort(bands);
        System.out.println(bands);

        Iterator iterator = bands.iterator();
        while (iterator.hasNext()) {
            String obj = (String) iterator.next();
            System.out.println(obj);
        }
        System.out.println("\nAfter copying:\n");
        Iterator iterator1 = bands1.iterator();
        while (iterator1.hasNext()) {
            String obj1 = (String) iterator1.next();
            System.out.println(obj1);
        }
    }
}


