/*
Write a program that prompts the user for a filename, as well as the upper and lower bounds for the accepted range of numbers.
Then the program reads the numbers contained in the file (each number is on its own line) and
only accounts for the numbers which are inside the given range.

Finally, the program should print the number of numbers that were inside the given range.
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        Scanner userFile = new Scanner(Paths.get(file));

        while (userFile.hasNextLine()) {
            String row = userFile.nextLine();
            if (Integer.parseInt(row) >= lowerBound && Integer.parseInt(row) <= upperBound) {
                counter ++;
            }
        }
        System.out.println("Numbers: " + counter);
    }
}
