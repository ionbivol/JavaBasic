package flowControl.forElse;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int christmasTree = scanner.nextInt();

        for (int i = 0; i < christmasTree; i++) {
            for (int j = 0; j < christmasTree - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

            for (int j = 0; j < christmasTree - 1; j++) {
                System.out.print(" ");
            }
        }


    }
}
