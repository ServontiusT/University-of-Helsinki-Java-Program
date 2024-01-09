/*
* Part one
* Define a method called printStars that prints the given number of stars and a line break.
*/

/*
* Part 2
* Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method.
* */

public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for(int counter = 1; counter <= number; counter++) {
            System.out.print("*");
        }
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for(int row = 1; row <= size; row++) {
            printStars(size);
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
    }
}
