package lesson02;

public class Main {
    public static void main(String[] args) {
        EachNthClass enc = new EachNthClass("abcdefg", 3);
        String s = enc.everyNth();
        System.out.println(s);
    }
}
