package flowControl.switchCase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


    /*Enter numbers to calculate the sum,
      when you want to know the result enter "0" */

    System.out.println("Enter numbers: ");
    Scanner scanner = new Scanner(System.in);

    int number;
    int sum = 0;
    int counter = 0;


        do{number = scanner.nextInt();
        counter++;
        sum = sum+number;

    }while (number != 0);
        System.out.println("Sum: " + sum);
        System.out.println("Number of inputs: " + counter);

    }
}
