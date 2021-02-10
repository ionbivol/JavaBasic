package flowControl.ifElse;

public class TernaryOperator {
    public static void main(String[] args) {

        int hour = 13;

        System.out.println("Before if statement");

        if (hour > 17) {
            System.out.println("It's evening");
        } else {
            System.out.println("it's good");
        }

        System.out.println("After if statement");


        int number1 = 34;
        int number2 = 45;
        //ternary operator
        int greaterNumber = number1 > number2 ? number2 : number1;

        //converting using if statement
        int greaterNum;
        if (number1 > number2) {
            greaterNum = number1;
        } else {
            greaterNum = number2;
        }

        System.out.println(greaterNum);



    }
}
