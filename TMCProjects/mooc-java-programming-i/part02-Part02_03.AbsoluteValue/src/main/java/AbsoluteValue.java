
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.valueOf(scanner.nextLine());
        double absoluteValue;

        if (numberInput < 0) {
            absoluteValue = numberInput * -1;
            System.out.println((int) absoluteValue);
        } else {
            System.out.println(numberInput);
        }
    }
}

/*
Write a program that reads an integer from the user.
If the number is less than 0, the program prints the given integer multiplied by -1.
In all other cases, the program prints the number itself.
A few examples of how the program's expected to function are shown below:

 */