
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int numOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int numTwo = Integer.valueOf(scanner.nextLine());

        int sum = numOne + numTwo;
        int value = numOne - numTwo;
        int product = numOne * numTwo;
        double result = (double) numOne / (double) numTwo;

        System.out.println(numOne + " + " + numTwo + " = " + sum);
        System.out.println(numOne + " - " + numTwo + " = " + value);
        System.out.println(numOne + " * " + numTwo + " = " + product);
        System.out.println(numOne + " / " + numTwo + " = " + result);
    }
}