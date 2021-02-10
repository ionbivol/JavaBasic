package flowControl.forElse;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        //TODO: check the exercise


        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > y || x < 0 || y > 10_000) {
            return;
        }
        int firstNumberDividedBy7;
        if (x % 7 == 0) {
            firstNumberDividedBy7 = x;
        } else {
            firstNumberDividedBy7 = x + (7 - x % 7);
        }
        for (int i = firstNumberDividedBy7; i <= y; i = i + 7) {
            System.out.println(i);
        }

    }
}
