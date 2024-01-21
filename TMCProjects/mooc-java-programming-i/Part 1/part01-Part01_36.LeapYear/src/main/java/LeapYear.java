
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int givenYear = Integer.valueOf(scan.nextLine());

        boolean isStandardLeapYear = givenYear % 4 == 0;
        boolean isNonStandardLeapYear100 = givenYear % 100 == 0;
        boolean isNonStandardLeapYear400 = givenYear % 400 == 0;

        if (isNonStandardLeapYear100 && !isNonStandardLeapYear400) {
            System.out.println("The year is not a leap year.");
        } else if (isNonStandardLeapYear100 && isNonStandardLeapYear400) {
            System.out.println("The year is a leap year.");
        } else if (isStandardLeapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
