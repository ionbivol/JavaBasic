package flowControl.If_Statement;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        //Write a program that will allow the user to type an year,
        // check it out if this is a leap year or not.

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter an year to check if it's leap ");
        int year = scanner.nextInt();


        if (year % 4 == 0 && year != 0 || year % 100 == 0) {
            System.out.println("is leap year");
        } else {
            System.out.println("is not leap year");

        }
    }
}
