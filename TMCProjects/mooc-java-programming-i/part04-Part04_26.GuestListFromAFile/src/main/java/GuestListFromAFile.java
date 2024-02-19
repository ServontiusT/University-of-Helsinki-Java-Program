/*
The exercise template comes ready with functionality for the guest list application.
It checks whether names entered by the user are on the guest list.

However, the program is missing the functionality needed for reading the guest list.
Modify the program so that the names on the guest list are read from the file.
*/
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        Scanner fileReader = new Scanner(Paths.get(file));

        for (Scanner name = fileReader; name.hasNext(); ) {
            String row = name.next();
            list.add(row);
        }

        System.out.println("");

        System.out.println("Enter names, an empty line quits.");

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
