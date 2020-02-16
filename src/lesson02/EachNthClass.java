package lesson02;

public class EachNthClass {
    private String text;
    private int n;

    public EachNthClass(String text, int n) {
        this.text = text;
        this.n = n;
    }

    public String eachNth() {
        if (text.isEmpty()) {
            return "Text shouldn't be empty";
        }
        String s = "";
        for(int i=0; i < text.length(); i+=n) {
            s = s + text.charAt(i);
        }
        return s;
    }
}
