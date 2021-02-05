package methodsExercise;

public class Exercise1 {
    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));  // Concatenare  -> alipirea unei valori

        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("d"));  // Aflarea pozitiei a unei valori dintr-un cuvaint


        int x;
        x = 5;
        int y = 10;
        int resultMax = Math.max(x, y);    // The highest value
        int resultMin = Math.min(x,y);
        System.out.println(resultMin);    // The lowest value -> valoarea cea mai mica
        System.out.println(resultMax);

        int a = 16;
        double div = Math.sqrt(a);                   //Extragerea patratului
        System.out.println(div);

        String[] cars = {"Volvo","BMw","Ford"};
        System.out.println(cars.length);            //Lungimea Array
        for(String i : cars) {
            System.out.println(i);


        }


    }

}




