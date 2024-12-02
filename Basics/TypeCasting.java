package Basics;

public class TypeCasting {
    public static void main(String[] args) {
//        int r = 10;
//
//        double d = r; // int -> double
//
//        System.out.println(d);
//
//        double t = 10.5;
//
//        int a = (int)t; // double -> int
//
//        System.out.println(a);

        String num = "123a";
        Integer a = Integer.parseInt(num);
        Double d = Double.parseDouble(num);
        System.out.println(a);
        System.out.println(d);
    }
}
