
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) throws IOException {
        Scanner fileScanner = new Scanner(Paths.get("data.txt"));

        while(fileScanner.hasNextLine()) {
            String row = fileScanner.nextLine();

            System.out.println(row);
        }
    }
}
