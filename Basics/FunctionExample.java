package Basics;

public class FunctionExample {

    static int add(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }

    public static void main(String[] args) {
        int i = 3;
        int j = 5;
        int k = 7;
        int n = add(i,j,k);
        System.out.println(n);
    }
}
