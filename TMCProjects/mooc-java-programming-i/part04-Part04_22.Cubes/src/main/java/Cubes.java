
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userNumber;
        int numberAsInt;

        while(true) {
            System.out.print("");
            userNumber = scanner.nextLine();

            if(userNumber.equals("end")) {
                break;
            } else {
                numberAsInt = Integer.parseInt(userNumber);
                System.out.println(numberAsInt * numberAsInt * numberAsInt);
            }
        }
    }
}
