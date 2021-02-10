package flowControl.forElse;

public class Exercise1 {

    public static void main(String[] args) {

        float sum = 0;
        int lowerBound = 1;
        int upperBound = 100;
        float average;

        for(int number = lowerBound; number <=upperBound ;number++){
            sum = sum + number;
        }

        average = sum/upperBound;

        System.out.println("The sum is " +sum);
        System.out.println("The average is " +average);


    }
}
