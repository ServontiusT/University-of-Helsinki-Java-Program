/*
* Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops.
* After this the program will print the smallest number in the list, and also the indices where that number is found.
* Notice: the smallest number can appear multiple times in the list.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numberList = new ArrayList<>();

        while (true) {
            int userNumber = Integer.parseInt(scanner.nextLine());
            if (userNumber == 9999) {
                break;
            }
            numberList.add(userNumber);
        }

        System.out.println();

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        System.out.print("Smallest number: ");
        int smallestNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numberList.size() - 1; i++) {
            if (smallestNumber == numberList.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
