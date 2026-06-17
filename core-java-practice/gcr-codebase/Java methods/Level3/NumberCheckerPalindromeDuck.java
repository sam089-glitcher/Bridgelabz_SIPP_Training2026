import java.util.Scanner;

public class NumberCheckerPalindromeDuck {
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

    public static int[] reverseDigits(int[] digits) {
        int[] reverse = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }

        return reverse;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reverse = reverseDigits(digits);
        return areArraysEqual(digits, reverse);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = storeDigits(number);
        int[] reverse = reverseDigits(digits);

        System.out.println("Count of digits is " + countDigits(number));
        System.out.print("Digits are: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.print("Reversed digits are: ");
        for (int digit : reverse) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Arrays are equal: " + areArraysEqual(digits, reverse));
        System.out.println("Is palindrome number: " + isPalindrome(digits));
        System.out.println("Is duck number: " + isDuckNumber(digits));
    }
}
