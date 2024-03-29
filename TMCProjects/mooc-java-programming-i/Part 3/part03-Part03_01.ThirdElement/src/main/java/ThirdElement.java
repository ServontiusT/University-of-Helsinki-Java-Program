/*
* Modify the program so that instead of the first value, the third value on the list is printed.
* Remember that programmers start counting from zero!
* The program is allowed to malfunction if there are fewer than three entries on the list,
* so you don't need to prepare for such an event at all.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            list.add(input);
        }

        System.out.println(list.get(2));
    }
}
