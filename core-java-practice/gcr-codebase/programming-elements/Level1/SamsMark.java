import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam's average mark in PCM is " + average);
    }
}