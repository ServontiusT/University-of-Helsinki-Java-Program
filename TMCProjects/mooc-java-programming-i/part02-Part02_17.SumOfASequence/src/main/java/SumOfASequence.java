/*
Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
 */
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int userNumber = Integer.valueOf(scanner.nextLine());

        int sumOfNumbers = 0;

        for (int i = 1; i <= userNumber; i++){
            sumOfNumbers = sumOfNumbers + i;
        }
        System.out.print("The sum is " + sumOfNumbers);
    }
}
