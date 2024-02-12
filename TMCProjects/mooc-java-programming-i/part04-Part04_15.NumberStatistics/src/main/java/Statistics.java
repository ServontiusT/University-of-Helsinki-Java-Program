/*
Part 1:
Create a class Statistics that has the following functionality (the file for the class is provided in the exercise template):

a method addNumber adds a new number to the statistics
a method getCount tells the number of added numbers
The class does not need to store the added numbers anywhere, it is enough for it to remember their count.
At this stage, the addNumber method can even neglect the numbers being added to the statistics, since the only thing being stored is the count of numbers added.

Part 2:
Expand the class with the following functionality:

the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
the average method tells the average of the numbers added (the average of an empty number statistics object is 0

Part 3:
Write a program that asks the user for numbers until the user enters -1. The program will then provide the sum of the numbers.

The program should use a Statistics object to calculate the sum.

NOTE: Do not modify the Statistics class in this part. Instead, implement the program for calculating the sum by making use of it.

Part 4:
Change the previous program so that it also calculates the sum of even and odd numbers.

NOTE: Define three Statistics objects in the program. Use the first to calculate the sum of all numbers, the second to calculate the sum of even numbers, and the third to calculate the sum of odd numbers.

For the test to work, the objects must be created in the main program in the order they were mentioned above (i.e., first the object that sums all the numbers, then the one that sums the even ones, and then finally the one that sums the odd numbers)!

NOTE: Do not change the Statistics class in any way!
*/

public class Statistics {
    private int number;
    private int counter;

    public Statistics() {}

    public void addNumber(int number) {
        this.counter++;
        this.number+= number;
    }

    public int getCount() {
        return this.counter;
    }

    public int sum() {
        return this.number;
    }
    public double average() {
        if (this.number > 0) {
            return (double) this.number / (double) this.counter;
        } else {
            return 0.0;
        }
    }
}
