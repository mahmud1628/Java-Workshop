package Basics;

public class ArrayExample {
    public static void main(String[] args) {
        // singel - dimensional array

        int [] roll = new int[5];
        roll[0] = 12;
        roll[1] = 10;
        roll[2] = 15;
        roll[3] = 20;
        roll[4] = 10;

        System.out.println(roll[2]);
        roll[2] = 25;
        System.out.println(roll[2]);
    }
}
