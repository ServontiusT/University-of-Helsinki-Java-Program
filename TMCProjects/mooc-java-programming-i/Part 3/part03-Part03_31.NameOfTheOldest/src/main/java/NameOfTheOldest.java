/*
* Write a program that reads names and ages from the user until an empty line is entered.
* The name and age are separed by a comma.

After reading all user input, the program prints the name of the oldest person.
You can assume that the user enters at least one person, and the that one of the users is older than the others.
*/

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] person;
        int oldestAge = 0;
        String oldestPerson = null;

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            } else {
                person = userInput.split(",");
                if (Integer.parseInt(person[1]) > oldestAge) {
                    oldestAge = Integer.parseInt(person[1]);
                    oldestPerson = person[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + oldestPerson);

    }
}
