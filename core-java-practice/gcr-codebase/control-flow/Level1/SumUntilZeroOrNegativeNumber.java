import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            double number = input.nextDouble();

            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println(total);
    }
}