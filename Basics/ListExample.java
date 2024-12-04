package Basics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> roll = new ArrayList<>();
        roll.add(10);
        roll.add(11);
        roll.add(15);

        System.out.println(roll.get(2));
        roll.remove(2);
        // System.out.println(roll.get(2));
    }
}
