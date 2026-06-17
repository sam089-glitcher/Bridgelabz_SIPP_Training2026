import java.util.Scanner;

public class Main {

    static String toUpperCustom(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String custom = toUpperCustom(text);
        String builtin = text.toUpperCase();

        System.out.println(custom);
        System.out.println(builtin);
        System.out.println(compareStrings(custom, builtin));
    }
}