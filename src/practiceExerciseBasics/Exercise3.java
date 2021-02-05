package practiceExerciseBasics;

public class Exercise3 {

    public static void main(String[] args) {

//        Display any three strings of characters on one line so that they are aligned to the right
//        edge of the 15-character blocks. How to align strings to the left edge?

        String name1 = "John";
        String name2 = "Marry";
        String name3 = "Mike";

        System.out.printf("%15s %15s %15s",name1, name2, name3);
        System.out.printf("\n\n%65s %15s %15s", name1, name2, name3);
        System.out.printf("\n\n%115s %15s %15s", name1, name2, name3);
        System.out.printf("\n\n%140s %15s %15s", name3, name2, name1);

    }
}
