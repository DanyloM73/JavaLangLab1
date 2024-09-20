import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean isAscending(String word) {
        if (word.isEmpty()) return false;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < word.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String[] getAscendingWords(String input) {
        String[] words = input.split("\\s+");
        ArrayList<String> ascendingWords = new ArrayList<>();

        for (String word : words) {
            if (isAscending(word)) {
                ascendingWords.add(word);
            }
        }

        return ascendingWords.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your words: ");
        String input = scanner.nextLine();

        String[] ascendingWords = getAscendingWords(input);

        System.out.print("Array of ascending words: ");
        if (ascendingWords.length > 0) {
            System.out.print("[");
            for (int i = 0; i < ascendingWords.length; i++) {
                System.out.print("\"" + ascendingWords[i] + "\"");
                if (i < ascendingWords.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("[]");
        }
    }
}
