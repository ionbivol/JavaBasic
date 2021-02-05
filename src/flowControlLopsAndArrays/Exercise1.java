package flowControlLopsAndArrays;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

//        Write a method that receives 2 parameters, a string and an int,
//        and checks if the int variable is contained by the string.The method
//        will return a boolean. Example: returns true for string “2 apples”  and int 2.

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if(value > 30 ){
            System.out.println("The value is bigger then");
        }

    }
}
