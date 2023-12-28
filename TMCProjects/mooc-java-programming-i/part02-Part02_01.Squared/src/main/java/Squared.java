
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.valueOf(scanner.nextLine());
        int squaredNumber = numberInput * numberInput;

        System.out.println(squaredNumber);


    }
}
