package practiceExerciseBasics;

public class Exercise2 {

    public static void main(String[] args) {

//        Enter any value with several digits after the decimal point and assign it to variable
//        of type double. Display the given value rounded to two decimal places.

        double number = 2.3213;
         System.out.printf("%.2f",number); //This is version with the initialized number
        System.out.println(String.format("\n%.2f",number));   // \n=new line
        System.out.printf("%.2f%n", 2.456786);

    }
}
