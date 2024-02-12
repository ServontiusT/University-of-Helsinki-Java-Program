
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        Statistics statistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();

        int userNumber = 0;
        System.out.println("Enter numbers:");

        while(true) {
            userNumber = Integer.parseInt(scanner.nextLine());
            if(userNumber == -1) {
                break;
            } else if(userNumber % 2 == 0){
              statistics.addNumber(userNumber);
              evenStatistics.addNumber(userNumber);
            } else {
                statistics.addNumber(userNumber);
                oddStatistics.addNumber(userNumber);
            }
        }

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}
