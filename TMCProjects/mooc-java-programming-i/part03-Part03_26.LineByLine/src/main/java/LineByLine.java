/*
* Write a program that reads strings from the user.
* If the input is empty, the program stops reading input and halts.
* For each non-empty input it splits the string input by whitespaces   and prints each part of the string on a new line.
*/
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String userString = scanner.nextLine();
            if (userString.isEmpty()) {
                break;
            } else {
                splitString(userString);
                continue;
            }
        }
    }

    public static void splitString (String sentence) {
        String[] sentenceArray = sentence.split(" ");

        for (String word: sentenceArray) {
            System.out.println(word);
        }
    }
}
