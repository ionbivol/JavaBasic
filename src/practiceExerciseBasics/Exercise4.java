package practiceExerciseBasics;

public class Exercise4 {

    public static void main(String[] args) {

       /* Enter two values of type int. Display their division casted to the double type and rounded to
        the third decimal point. */

        int number = 295;
        int number2 = 13;
        double d = ((double) number) / number2;
        System.out.printf("%.3f",d);

    }
}
