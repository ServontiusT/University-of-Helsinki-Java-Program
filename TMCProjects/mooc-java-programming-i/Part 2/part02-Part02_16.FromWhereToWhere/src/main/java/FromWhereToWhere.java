/*
Write a program which prints the integers from 1 to a number given by the user.

Ask the user for the starting point as well.

If the upper limit is smaller than the starting point, nothing is printed:
 */
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int endNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int startNumber = Integer.valueOf(scanner.nextLine());

        for (int i = startNumber; i <= endNumber; i++){
            System.out.println(i);
        }

    }
}
