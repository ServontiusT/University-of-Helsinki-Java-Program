/*
Write a program, according to the preceding example, that asks the user to input values until they input the value 4.
 */
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;

        while (true) {
            System.out.println("Give a number: ");
            userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber == 4) {
                break;
            }
        }
    }
}
