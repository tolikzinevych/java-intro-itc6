package lesson05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MyCollection {
    public static void main(String[] args) {
        ArrayList<String>bands = new ArrayList<String>();
        bands.add("Iron Maiden");
        bands.add("Manowar");
        bands.add("Helloween");
        bands.add("Gamma Ray");
        bands.add("Judas Priest");
        bands.add("Metallica");
//        System.out.println(bands);
        bands.remove("Manowar");
        System.out.println(bands);
        Collections.sort(bands);
        System.out.println(bands);
        Iterator iterator = bands.iterator();
        System.out.println(iterator);
    }

}
