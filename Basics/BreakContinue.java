package Basics;

public class BreakContinue {
    public static void main(String[] args) {
//        for(int i = 0; i< 10; i++) {
//            if(i == 5) {
//                break;
//            }
//            System.out.println("Bangladesh " + i);
//        }

        for(int i = 0; i< 10; i++) { // i = i + 1
            if(i == 5) {
                continue;
            }
            System.out.println("Bangladesh " + i);
        }
    }
}
