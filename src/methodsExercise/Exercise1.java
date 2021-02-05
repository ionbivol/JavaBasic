package methodsExercise;

public class Exercise1 {
    public static void main(String[] args) {

        String firstName = "John";
        String lastName = " Doe";
        System.out.println(firstName.concat(lastName));  // Concatenate  -> put together two strings

        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("d"));  // Finding the position of a value in a word


        int x;
        x = 5;
        int y = 10;
        int resultMax = Math.max(x, y);    // The highest value
        int resultMin = Math.min(x,y);
        System.out.println(resultMin);    // The lowest value
        System.out.println(resultMax);

        int a = 16;
        double div = Math.sqrt(a);                   //square extraction
        System.out.println(div);

        String[] cars = {"Volvo","BMw","Ford"};
        System.out.println(cars.length);
        for(String i : cars) {
            System.out.println(i);





        }


    }

}




