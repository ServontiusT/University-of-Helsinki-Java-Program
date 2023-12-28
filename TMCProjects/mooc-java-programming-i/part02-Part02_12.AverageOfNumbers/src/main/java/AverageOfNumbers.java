/*
Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the numbers.
The number zero does not need to be counted to the average.
You may assume that the user inputs at least one number.

The average of the numbers can be calculated by dividing the sum of numbers with the amount of the numbers
 */
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avgOfNumbers = 0.0;
        double sumOfNumbers = 0.0;
        int countOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            double userInput = Double.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            } else {
                countOfNumbers += 1;
                sumOfNumbers = sumOfNumbers + userInput;
            }
        }
        avgOfNumbers = sumOfNumbers / countOfNumbers;
        System.out.println("Average of the numbers: " + avgOfNumbers);
    }
}
