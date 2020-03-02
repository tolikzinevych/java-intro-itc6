package lesson02;

public class EachNthClass {
/*    private String text;
    private int n;*/

/*
    public EachNthClass() {
*/
/*        this.text = text;
        this.n = n;*//*

    }
*/

    public String everyNth(String text1, int n1) {
        if (text1.isEmpty()) {
            return "Text shouldn't be empty";
        }
        String s = "";
        for(int i=0; i < text1.length(); i+=n1) {
            s = s + text1.charAt(i);
        }
        return s;
    }
    public static void main(String[] args) {
        EachNthClass enc = new EachNthClass();
        String s = enc.everyNth("abcdefg", 2);
        System.out.println(s);

    }
}
