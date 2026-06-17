import java.util.Scanner;

public class NumberCheckerHarshad {
    public static int countDigits(int number) {
        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] storeDigits(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int findDigitSum(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static double findSumOfSquares(int[] digits) {
        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int digitSum = findDigitSum(digits);

        return digitSum != 0 && Math.abs(number) % digitSum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        for (int i = 0; i < frequency.length; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = storeDigits(number);
        int[][] frequency = findDigitFrequency(digits);

        System.out.println("Count of digits is " + countDigits(number));
        System.out.println("Sum of digits is " + findDigitSum(digits));
        System.out.println("Sum of squares of digits is " + findSumOfSquares(digits));
        System.out.println("Is Harshad number: " + isHarshadNumber(number, digits));
        System.out.println("Digit frequencies:");

        for (int[] row : frequency) {
            if (row[1] > 0) {
                System.out.println(row[0] + " occurs " + row[1] + " times");
            }
        }
    }
}
