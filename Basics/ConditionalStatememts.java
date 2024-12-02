package Basics;

public class ConditionalStatememts {
    public static void main(String[] args) {
        // if

//        int a = 10;
//        int b = 11;
//
//        if(a == b) {
//            System.out.println("a and b are equal");
//        }

//        int a = 10;
//        int b = 10;
//
//        if(a == b) {
//            System.out.println("a and b are equal");
//        } else {
//            System.out.println("a and b are not equal");
//        }

//        int a = 10;
//        int b = 8;
//
//        if(a == b) {
//            System.out.println("a and b are equal");
//        } else if(a < b){
//            System.out.println("b is greater than a");
//        } else {
//            System.out.println("a is greater than b");
//        }

        int a = 10;
        int b = 10;
        int c = 10;

        if(a == b) {
            System.out.println("a and b are equal");
            if(a == c) {
                System.out.println("all the numbers are equal");
            }
        }
    }
}
