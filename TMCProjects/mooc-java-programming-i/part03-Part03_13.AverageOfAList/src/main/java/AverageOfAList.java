/*
* When reading ends, calculate the average of the numbers in it, and then print that value.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> arrayOfInt = new ArrayList<>();

        while (true) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber == -1) {
                break;
            }
            arrayOfInt.add(inputNumber);
        }

        double arrayAverage = 0;

        for (Integer n : arrayOfInt) {
            arrayAverage += n;
        }

        System.out.println("Average: " + arrayAverage / arrayOfInt.size());
    }
}
