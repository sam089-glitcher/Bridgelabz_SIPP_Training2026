import java.util.Scanner;

public class Main {

    static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Shortest = " + shortest);
        System.out.println("Longest = " + longest);
    }
}