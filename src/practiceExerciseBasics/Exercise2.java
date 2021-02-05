package practiceExerciseBasics;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

//        Enter any value with several digits after the decimal point and assign it to variable
//        of type double. Display the given value rounded to two decimal places.

        double number = 45.45615;
        System.out.printf("%.2f",number);  //This is version with the initialized number
        System.out.println(String.format("\n%.2f",number));   //This is another version

        System.out.printf("%.2f\n", 2.456786);      //another way to format a number
        System.out.printf("%.3f",102.156545);
        System.out.println("");

        // format an entered number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double number\n");
        double intDoubleNumber = scanner.nextDouble();
        System.out.printf("Yours formatted number is: "+"%.1f",intDoubleNumber);


    }
}
