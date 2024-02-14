/*
Write a program that first reads book information from the user.
The details to be asked for each book include the title, the number of pages and the publication year.
Entering an empty string as the name of the book ends the reading process.

After this the user is asked for what is to be printed.
If the user inputs "everything", all the details are printed: the book titles, the numbers of pages and the publication years.
However, if the user enters the string "name", only the book titles are printed.

It is probably worthwhile to implement a class called Book to represent a book.
There are two points in total available for this exercise.
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> bookArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("");
            String inputBookTitle = scanner.nextLine();

            if(inputBookTitle.isEmpty()) {
                break;
            } else {
                System.out.print("");
                String inputPageCount = scanner.nextLine();
                System.out.print("");
                String inputPubYear = scanner.nextLine();

                Book givenBook = new Book(inputBookTitle, inputPageCount, inputPubYear);
                bookArrayList.add(givenBook);
            }
        }

        System.out.print("What information will be printed?");
        String whatToPrint = scanner.nextLine();

        if(whatToPrint.equals("name")) {
            for(Book book: bookArrayList) {
                System.out.println(book.getBookTitle());
            }
        } else if(whatToPrint.equals("everything")) {
            for(Book book: bookArrayList) {
                System.out.println(book);
            }
        }
    }
}
