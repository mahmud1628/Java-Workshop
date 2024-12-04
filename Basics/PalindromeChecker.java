package Basics;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Enter a word to check: ");
        word = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i = i + 1) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
              isPalindrome = false;
            }
        }

        if(isPalindrome == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
