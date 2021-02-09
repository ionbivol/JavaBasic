package flowControl.ifStatement;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();

        if (nr1 < 0 && nr2 < 0 || nr1 > 0 && nr2 > 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
