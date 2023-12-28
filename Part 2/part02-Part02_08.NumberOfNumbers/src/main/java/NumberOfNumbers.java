/*
Write a program that reads values from the user until they input a 0.
After this, the program prints the total number of inputted values.
The zero that's used to exit the loop should not be included in the total number count.
 */
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;


        while(true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            } else {
                numberOfNumbers += 1;
            }
        }
        System.out.println("Number of numbers: " + numberOfNumbers);
    }
}
