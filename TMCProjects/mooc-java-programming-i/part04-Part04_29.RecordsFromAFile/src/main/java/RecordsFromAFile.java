/*
Your task is to write a program that first prompts the user for the name of the file they want to read.
The program then prints the content of the file in the following way (we're assuming below that the output is from the above-mentioned file):
 */

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        Scanner dataFile = new Scanner(Paths.get(scanner.nextLine()));

        while (dataFile.hasNextLine()) {
            String line = dataFile.nextLine();
            String[] separatedData = line.split(",");

            if (line.isEmpty()) {
                continue;
            }

            if (Integer.parseInt(separatedData[1]) != 1) {
                System.out.println(separatedData[0] + ", age: " + separatedData[1] + " years");
            } else {
                System.out.println(separatedData[0] + ", age: " + separatedData[1] + " year");
            }
        }
    }
}
