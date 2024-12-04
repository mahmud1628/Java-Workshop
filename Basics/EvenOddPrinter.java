package Basics;

import java.util.Scanner;

public class EvenOddPrinter {
    public static void main(String[] args) {
        // Print all even and odd numbers separately in a given range
        Scanner scanner = new Scanner(System.in);
        int low, high;
        System.out.println("Enter the smaller number  : ");
        low = scanner.nextInt();
        System.out.println("Enter the bigger number : ");
        high = scanner.nextInt();

        // System.out.println(low + " " + high);

        if ( low > high ) {
            System.out.println("Invalid range");
            return;
        }

        if( low % 2 == 0 ) {
            // even numbers
            System.out.print("Even numbers: ");
            for (int i = low; i <= high ; i = i + 2) {
                System.out.print(i + " ");
            }
            System.out.println();

            // odd numbers
            System.out.print("Odd numbers: ");
            for (int j = low + 1; j <= high; j = j + 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        } else {

        }
    }
}
