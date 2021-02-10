package flowControl.forElse;

public class OddOrEven {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++)
            if (i % 2 == 0)
                System.out.println("This is a even number: " + i);
            else if (i % 2 != 0)
                System.out.println("This is a odd number: " + i);
    }
}
