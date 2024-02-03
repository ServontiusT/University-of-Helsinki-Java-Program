/*
Write a program that reads names and birth years from the user until an empty line is entered.
The name and birth year are separated by a comma.

After that the program prints the longest name and the average of the birth years.
If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> personNames = new ArrayList<>();
        ArrayList<Integer> birthYear = new ArrayList<>();

        String longestName = null;
        int characterCount = 0;
        double averageBirthYear = 0.0;

        while(true){
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                break;
            } else {
                personNames.add(userInput.split(",")[0]);
                birthYear.add(Integer.parseInt(userInput.split(",")[1]));
            }
        }

        for (String name: personNames) {
            if (name.length() > characterCount) {
                longestName = name;
                characterCount = name.length();
            }
        }
        for (int i = 0; i <= birthYear.size()-1; i++) {
            averageBirthYear = averageBirthYear + birthYear.get(i);
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (averageBirthYear / birthYear.size()));
    }
}
