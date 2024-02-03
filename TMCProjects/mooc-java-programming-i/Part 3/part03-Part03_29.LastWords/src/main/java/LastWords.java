/*
* Write a program that reads user input until an empty line is entered.
* For each non-empty line the program splits the string by spaces   and prints the last part of the string.
*/
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                return;
            } else {
                printLastWord(userInput);
            }
        }
    }

    public static void printLastWord(String sentence) {
        String[] splitSentenceArray = sentence.split(" ");

        int arraySize = splitSentenceArray.length;
        String lastWord = splitSentenceArray[arraySize - 1];

        System.out.println(lastWord);
    }
}