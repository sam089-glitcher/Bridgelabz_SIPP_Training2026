import java.util.Scanner;

public class Main {

    static int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ')
            start++;

        while (end >= 0 && text.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    static String substringCustom(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] index = trimIndexes(text);

        String custom = substringCustom(text, index[0], index[1]);
        String builtin = text.trim();

        System.out.println(custom);
        System.out.println(builtin);
        System.out.println(custom.equals(builtin));
    }
}