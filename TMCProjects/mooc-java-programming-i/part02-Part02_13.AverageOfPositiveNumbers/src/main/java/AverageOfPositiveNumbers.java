/*
Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the positive numbers (numbers that are greater than zero).

If no positive number is inputted, the program prints "Cannot calculate the average"
 */
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPositives = 0;
        int sumOfNumbers = 0;
        double avgOfNumbers = 0.0;

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            } else if (userInput < 0) {
                continue;
            } else {
                numberOfPositives += 1;
                sumOfNumbers = sumOfNumbers + userInput;
            }
        }
        if (numberOfPositives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avgOfNumbers = (double) sumOfNumbers / numberOfPositives;
            System.out.println(avgOfNumbers);
        }
    }
}
