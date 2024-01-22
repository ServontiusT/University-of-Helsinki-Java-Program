/*
* Expand the program by adding a functionality that asks the user for a number, and reports that number's index in the list.
* If the number is not found, the program should not print anything.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println();

        // implement here finding the indices of a number
        ArrayList<Integer> identifiedNumber = new ArrayList<>();

        System.out.print("Search for? ");
        int userNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= list.size() - 1; i++) {
            if (userNumber == list.get(i)) {
                System.out.println(userNumber + " is at index " + i);
            }
        }
    }
}
