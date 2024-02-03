/*
Write a program that reads user input until an empty line.
For each non-empty string, the program splits the string by spaces   and then prints the pieces that contain av,
each on a new line.
*/
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userSentence = scanner.nextLine();

            if (userSentence.isEmpty()) {
                break;
            } else {
                splitString(userSentence);
            }
        }

    }

    public static void splitString(String sentence) {
        String[] sentenceArray = sentence.split(" ");

        for (String word: sentenceArray) {
            if (word.contains("av")) {
                System.out.println(word);
            }
        }
    }
}
