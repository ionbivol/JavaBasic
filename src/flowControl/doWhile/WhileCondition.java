package flowControl.doWhile;

public class WhileCondition {

    public static void main(String[] args) {

        // The while loop loops through a block of code as long
        // long as a specified condition is true!


        int number = 0;

        while (number < 5) {
            System.out.println(number);
            number++;
        }

        System.out.println("\n Here starts do while condition \n");

        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }
}
