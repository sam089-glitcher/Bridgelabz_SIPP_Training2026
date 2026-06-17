import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long number = input.nextLong();
        long temp = number;

        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        int[] digits = new int[count];

        temp = number;

        if (number == 0) {
            digits[0] = 0;
        } else {
            int index = 0;
            while (temp != 0) {
                digits[index++] = (int)(temp % 10);
                temp /= 10;
            }
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " Frequency = " + frequency[i]);
            }
        }
    }
}