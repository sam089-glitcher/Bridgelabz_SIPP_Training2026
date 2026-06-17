import java.util.Scanner;

public class NumberCheckerSpecial {
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int findDigitSum(int number) {
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static int findDigitProduct(int number) {
        number = Math.abs(number);

        if (number == 0) {
            return 0;
        }

        int product = 1;
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }

        return product;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        return findDigitSum(square) == number;
    }

    public static boolean isSpyNumber(int number) {
        return findDigitSum(number) == findDigitProduct(number);
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;

        while (number > 0) {
            if (number % 10 != square % 10) {
                return false;
            }
            number /= 10;
            square /= 10;
        }

        return true;
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Is prime number: " + isPrimeNumber(number));
        System.out.println("Is neon number: " + isNeonNumber(number));
        System.out.println("Is spy number: " + isSpyNumber(number));
        System.out.println("Is automorphic number: " + isAutomorphicNumber(number));
        System.out.println("Is buzz number: " + isBuzzNumber(number));
    }
}
