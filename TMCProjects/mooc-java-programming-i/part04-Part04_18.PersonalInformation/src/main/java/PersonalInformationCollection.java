/*
The program described here should be implemented in the class PersonalInformationCollection.
NB! Do not modify the class PersonalInformation.

After the user has entered the last set of details (they enter an empty first name), exit the repeat statement.

Then print the collected personal information so that each entered object is printed in the following format:
first and last names separated by a space (you don't print the identification number). 
*/
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        String userID;

        while(true) {
            System.out.print("");
            firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            } else {
                System.out.print("");
                lastName = scanner.nextLine();

                System.out.print("");
                userID = scanner.nextLine();

                PersonalInformation newUser = new PersonalInformation(firstName, lastName, userID);
                infoCollection.add(newUser);
            }
        }

        for(PersonalInformation person: infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
