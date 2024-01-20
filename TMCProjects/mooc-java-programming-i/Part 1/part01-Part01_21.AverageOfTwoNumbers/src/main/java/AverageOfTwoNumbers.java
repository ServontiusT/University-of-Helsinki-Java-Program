
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int numOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int numTwo = Integer.valueOf(scanner.nextLine());

        double avg = (double) (numOne + numTwo) / 2;

        System.out.println("The average is " + avg);
    }
}
