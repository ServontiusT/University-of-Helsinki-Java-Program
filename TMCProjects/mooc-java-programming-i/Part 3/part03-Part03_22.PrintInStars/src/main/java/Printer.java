/*
* Complete the method public static void printArrayInStars(int[] array) in the class named 'Printer' to make it print
* a row of stars for each number in the array.
* The amount of stars on each row is defined by the corresponding number in the array.
*/

public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int number: array) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
