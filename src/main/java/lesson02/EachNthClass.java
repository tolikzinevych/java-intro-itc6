package lesson02;

public class EachNthClass {

    public String everyNth(String text, int n) {
        if (text.isEmpty()) {
            return "Text shouldn't be empty";
        }
        String s = "";
        for(int i=0; i < text.length(); i+=n) {
            s += text.charAt(i);
        }
        return s;
    }
    public static void main(String[] args) {
        EachNthClass enc = new EachNthClass();
        String s = enc.everyNth("Miracle", 2);
        System.out.println(s);
        s = enc.everyNth("abcdefg", 2);
        System.out.println(s);
        s = enc.everyNth("abcdefg", 3);
        System.out.println(s);


    }
}