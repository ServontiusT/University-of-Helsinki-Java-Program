/*
* Create the method public static int sum(ArrayList<Integer> numbers) in the exercise template.
* The method is to return the sum of the numbers in the parameter list.
*/

import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);

        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers){
        int sumOfNumbers = 0;

        for (int number:numbers) {
            sumOfNumbers += number;
        }

        return sumOfNumbers;
    }

}
