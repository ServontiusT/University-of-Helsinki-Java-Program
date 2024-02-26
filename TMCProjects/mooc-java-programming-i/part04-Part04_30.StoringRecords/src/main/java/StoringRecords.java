/*
The exercise template already has a Person class, and the class StoringRecords has a body for the method public static ArrayList<Person> readRecordsFromFile(String file).
Implement the readRecordsFromFile method such that it reads the persons from the file passed as a parameter, and finally returns them in the list returned by the method.

The exercise template has a main method that you can use to test how your program works.
In this exercise, only modify the method readRecordsFromFile.
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) throws IOException {
        ArrayList<Person> persons = new ArrayList<>();

        Scanner inputFile = new Scanner(Paths.get(file));

        while (inputFile.hasNextLine()) {
            String row = inputFile.nextLine();

            if (row.isEmpty()) {
                break;
            } else {
                String[] splitPerson = row.split(",");
                String personName = splitPerson[0];
                int personAge = Integer.parseInt(splitPerson[1]);

                Person createdPerson = new Person(personName, personAge);
                persons.add(createdPerson);
            }
        }
        return persons;

    }
}
