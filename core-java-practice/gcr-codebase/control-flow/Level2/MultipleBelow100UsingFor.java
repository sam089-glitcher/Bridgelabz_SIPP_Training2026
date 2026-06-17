import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0 && number < 100) {
            for (int i = number; i < 100; i += number) {
                System.out.println(i);
            }
        }
    }
}