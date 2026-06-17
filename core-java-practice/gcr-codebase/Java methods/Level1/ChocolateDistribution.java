import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child will get " + result[1] + " chocolates");
        System.out.println("The remaining chocolates are " + result[0]);
    }
}
