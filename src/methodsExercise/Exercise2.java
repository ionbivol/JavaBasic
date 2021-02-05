package methodsExercise;

public class Exercise2 {
    public static void main(String[] args) {

        // Write a method that receives 2 string parameters and checks if the second string is
        // contained by the first one. The method will return a boolean.
        // Example: returns true for “The Witcher” and “Witcher”.

        System.out.println(isIncludedIn("The Wither", "Wither"));
        System.out.println(isIncludedIn2("Amazing", "nice weather"));
        System.out.println(checkIfItContainsLetterI("Lucian"));
    }

    public static boolean isIncludedIn(String word1, String word2) {
        return word1.contains(word2);
    }

    public static boolean isIncludedIn2(String word3, String word4) {
        return word3.contains(word4);
    }

    public static boolean checkIfItContainsLetterI(String name) {
        return name.contains("i");
    }
}

