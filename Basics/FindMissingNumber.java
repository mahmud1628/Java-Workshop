package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        // in the range 1 ... n

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the range: ");
        int n = scanner.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i = 0;i < n - 1 ;i++) {
            int a = scanner.nextInt();
            list.add(a);
        }

        // n (n + 1) /2

        int total = n * (n + 1) / 2;

        int givenTotal = 0;
        for( int i=0; i< list.size() ;i++) {
            givenTotal = givenTotal + list.get(i);
        }

        System.out.println(total - givenTotal);
    }
}
