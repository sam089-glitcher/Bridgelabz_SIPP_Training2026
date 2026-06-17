import java.util.Scanner;

public class NaturalNumberRecursiveSum {
    public static int findRecursiveSum(int number) {
        if (number == 1) {
            return 1;
        }

        return number + findRecursiveSum(number - 1);
    }

    public static int findFormulaSum(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("The number is not a natural number");
            return;
        }

        int recursiveSum = findRecursiveSum(number);
        int formulaSum = findFormulaSum(number);

        System.out.println("Sum using recursion is " + recursiveSum);
        System.out.println("Sum using formula is " + formulaSum);
        System.out.println("Both computations are correct: " + (recursiveSum == formulaSum));
    }
}
