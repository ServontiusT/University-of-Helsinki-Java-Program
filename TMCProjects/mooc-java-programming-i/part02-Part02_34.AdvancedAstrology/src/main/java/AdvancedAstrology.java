
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
        for (int spaces = 1; spaces <= number - 1; spaces++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int row = 1; row <= size; row++) {
            printSpaces(size - row + 1);
            printStars(row);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // Print the top part of the tree
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