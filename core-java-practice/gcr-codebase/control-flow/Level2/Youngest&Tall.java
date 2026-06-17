import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Youngest: Amar");
        else if (akbarAge < anthonyAge)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Tallest: Amar");
        else if (akbarHeight > anthonyHeight)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}