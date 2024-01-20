/*
Part 1:
Implement a program that asks the user for numbers (the program first prints "Give numbers: ") until the user gives the number -1.
 When the user writes -1, the program prints "Thx! Bye!" and ends.

 Part 2:
 Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.

 Part 3:
 Extend the program so that it also prints the number of numbers (not including the -1) the user has written.

 Part 4:
 Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.

 Part 5:
 Extend the program so that it prints the number of even and odd numbers (excluding the -1).
 */
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int totalNumbers = 0;
        double averageOfNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        System.out.println("Give numbers:");

        while(true) {
            int userInput = Integer.parseInt(scanner.nextLine());
            if(userInput == -1) {
                break;
            } else {
                sumOfNumbers += userInput;
                totalNumbers += 1;
                averageOfNumbers = (double) sumOfNumbers / totalNumbers;

                if(userInput % 2 == 0) {
                    evenNumbers +=1;
                } else {
                    oddNumbers +=1;
                }
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + averageOfNumbers);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
