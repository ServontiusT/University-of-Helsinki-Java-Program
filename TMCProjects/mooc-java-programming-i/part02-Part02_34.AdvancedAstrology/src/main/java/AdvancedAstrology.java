/*
* Define a method called christmasTree(int height) that prints the correct Christmas tree.
* The Christmas tree consists of a triangle with the specified height as well as the base.
* The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom.
* The tree is to be constructed by using the methods printSpaces and printStars.
*/
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int counter = 1; counter <= number; counter++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int spaces = number - 1; spaces >= 0; spaces--) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int row = 1; row <= size; row++) {
            printSpaces(size - row);
            printStars(row);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise


        for (int i = height - 1; i >= 1; i--) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }
        // Print the base of the tree
        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}