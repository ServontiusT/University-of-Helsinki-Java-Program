/*
* Write a program that asks the user for a string.
* If the user writes the string "true", the program prints "You got it right!", otherwise it prints "Try again!".
*/
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userString = scanner.nextLine();

        if (userString.equals("true") || userString.equals("True")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
