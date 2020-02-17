package lesson02;

import java.util.Arrays;

public class StringMethodsMain {
    public static void main(String[] args) {
        String s = "Some string to play with";

        //charAt
        System.out.println(s.charAt(2));

        //endsWith
        if (s.endsWith("tn")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //equals
        if (s.equals("Some string to play with")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //equalsEgnoreCase
        if (s.equalsIgnoreCase("some string to play with")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //length
        System.out.println(s.length());

        //replace
        System.out.println(s.replace('S', 'C'));

        //split
        System.out.println(Arrays.toString(s.split("o")));

        //startsWith
        if (s.startsWith("so")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //substring
        System.out.println(s.substring(5));

        //substring1
        System.out.println(s.substring(5, 8));

        //toLowerCase
        System.out.println(s.toLowerCase());

        //toUpperCase
        System.out.println(s.toUpperCase());

        s = "       " + s;
        System.out.println(s);
        //trim
        System.out.println(s.trim());





    }
}
