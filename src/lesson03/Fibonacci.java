package lesson03;

public class Fibonacci {
    public int n;

    public Fibonacci(int n) {
        this.n = n;
    }
    public String printFibonacciNumbers(){
        if (n < 0)
            System.out.println("Please enter a positive number more than 0");
        if (n == 0)
            System.out.println("Please enter a positive number more than 0");
     int a = 0;
     int b = 1;
     int c;
     String s = "";

        for(int i=0; i < (n-1); i++) {
            c = a + b;
            s = s + b + ", ";
            a = b;
            b = c;
        }
        return s;
    }
        public static void main(String[] args) {
            Fibonacci Arr = new Fibonacci(10);
            String s = Arr.printFibonacciNumbers();
            System.out.println("0, " + s);

        }
    }

/*public void printFibonacciNumbers(int n) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
        a = b;
        b = a + b;
            System.out.println(b);
        }
    }*/
