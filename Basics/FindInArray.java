package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindInArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements: ");
        n = scanner.nextInt();
        System.out.println("Enter " + n + " numbers: ");

        for(int i = 0 ;i < n;i++) {
            int a = scanner.nextInt();
            list.add(a);
        }
        System.out.println("Enter the number to find: ");
        int toFind = scanner.nextInt();

        for(int i = 0;i < list.size() ; i++) {
            if(list.get(i) == toFind) {
                System.out.println("Number is found");
                return;
            }
        }

        System.out.println("Number is not found");
    }
}
