package flowControl.doWhile;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        

        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int powersOfTheNum = 1;
        do {
            System.out.println(powersOfTheNum);
            powersOfTheNum = powersOfTheNum * 3;

        } while (powersOfTheNum < n);


    }
}
