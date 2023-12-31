/*
Implement a program which calculates the sum of a closed interval, and prints it.
Expect the user to write the smaller number first and then the larger number.
*/
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int startingNumber = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int endingNumber = Integer.valueOf(scanner.nextLine());

        int sumOfNumbers = 0;

        for (int i = startingNumber; i <= endingNumber; i++) {
            sumOfNumbers = sumOfNumbers + i;
        }

        System.out.print("The sum is: " + sumOfNumbers);
    }
}
