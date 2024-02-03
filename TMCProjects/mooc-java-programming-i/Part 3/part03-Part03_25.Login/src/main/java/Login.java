/*
Write a program that recognizes the following users:

username	password
alex	sunshine
emma	haskell
The program either shows a personal message or informs of an incorrect username or password.
*/
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String authenticatingUser = scanner.nextLine();

        System.out.print("Enter password: ");
        String authenticatingPasswd = scanner.nextLine();


        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};

        boolean usernameValidated = false;
        boolean passwdValidated = false;

        for (int i = 0; i <= usernames.length - 1; i++) {
            if (usernames[i].equals(authenticatingUser)) {
                usernameValidated = true;
            }
            if (passwords[i].equals(authenticatingPasswd)) {
                passwdValidated = true;
            }
        }

        if (usernameValidated && passwdValidated) {
            System.out.println("You have successfully logged in");
        } else {
            System.out.println("Incorrect username or password");
        }
    }
}
