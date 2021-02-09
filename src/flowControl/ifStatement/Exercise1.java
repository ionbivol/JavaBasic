package flowControl.ifStatement;

public class Exercise1 {
    public static void main(String[] args) {


        //1. Take two integer variables, say A
        //and B.
        //2. Assign values to the variables.
        //3. Compare variables if A is greater
        //than B.
        //4. If true print A is greater than B.
        //5. If false print A is not greater
        //than B.


        int A = 10;
        int B = 20;
        if (A > B) {
            System.out.println(A + " is greater then " + B);
        } else {
            System.out.println(A + " is smaller then " + B);
        }
    }
}
