package practiceExerciseBasics;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        /*Create three variables, one for each type: float, byte and char. Enter values corresponding to
those types using Scanner. What values are you able to enter for each type?*/

        Scanner scanner = new Scanner(System.in);

        float a;
        byte b;
        char c;

        System.out.println("Enter an float number");
        a = scanner.nextFloat();
        System.out.println("Enter an byte number");
        b = scanner.nextByte();
        System.out.println("Enter an char");
        c = scanner.next().charAt(0);

        System.out.println("The float number is: " + a);
        System.out.println("The byte number is: " + b);
        System.out.println("The char is: " + c);

    }
}
