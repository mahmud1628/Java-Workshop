package Basics;

import  java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
//        int a = 10;
//
//        switch(a) {
//            case 10:
//                System.out.println("a is 10");
//                break;
//            case 20:
//                System.out.println("a is 20");
//                break;
//            case 30:
//                System.out.println("a is 30");
//                break;
//        }

        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        scanner.nextLine();
        String operator = scanner.nextLine();

        switch(operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }

//        if(operator.equals("+")) {
//
//        }
    }
}
