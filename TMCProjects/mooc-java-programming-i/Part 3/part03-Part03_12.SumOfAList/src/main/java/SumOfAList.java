/*
* Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        int sumOfNumbers = 0;
        // toteuta listan lukujen summan laskeminen tänne
        for (Integer n : list) {
           sumOfNumbers += n;
        }

        System.out.println("Sum: " + sumOfNumbers);
    }
}
