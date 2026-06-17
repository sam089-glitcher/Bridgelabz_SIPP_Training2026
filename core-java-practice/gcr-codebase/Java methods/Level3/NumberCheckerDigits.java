import java.util.Scanner;

public class NumberCheckerDigits {
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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, digits.length);
        }

        return Math.abs(number) == sum;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[] {largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[] {smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = storeDigits(number);
        int[] largestValues = findLargestAndSecondLargest(digits);
        int[] smallestValues = findSmallestAndSecondSmallest(digits);

        System.out.println("Count of digits is " + countDigits(number));
        System.out.print("Digits are: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        System.out.println("Is duck number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong number: " + isArmstrongNumber(number, digits));
        System.out.println("Largest digit is " + largestValues[0]);
        System.out.println("Second largest digit is " + largestValues[1]);
        System.out.println("Smallest digit is " + smallestValues[0]);
        System.out.println("Second smallest digit is " + smallestValues[1]);
    }
}
