import java.util.Scanner;

public class NumberCheckerDivisors {
    public static int findSumOfProperDivisors(int number) {
        if (number <= 1) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        return number > 0 && findSumOfProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        return number > 0 && findSumOfProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        return number > 0 && findSumOfProperDivisors(number) < number;
    }

    public static int findFactorial(int digit) {
        int factorial = 1;

        for (int i = 2; i <= digit; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += findFactorial(digit);
            number /= 10;
        }

        return originalNumber == sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Is perfect number: " + isPerfectNumber(number));
        System.out.println("Is abundant number: " + isAbundantNumber(number));
        System.out.println("Is deficient number: " + isDeficientNumber(number));
        System.out.println("Is strong number: " + isStrongNumber(number));
    }
}
