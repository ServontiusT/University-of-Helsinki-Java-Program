/*
* Modify the program to do following: After the first printing, the program should ask for two indices from the user.
* The values in these two indices should be swapped, and in the end the values of the array should be printed once again.
*/
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them

        System.out.println("Give two indices to swap:");
        int firstIndex = Integer.parseInt(scanner.nextLine());
        int secondIndex = Integer.parseInt(scanner.nextLine());
        int helperNumber = array[firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = helperNumber;


        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
