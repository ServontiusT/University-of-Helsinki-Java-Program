
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer t = new Timer();
        int i = 0;

        //When the advance method is called 1222 times, the print should be "12:22".
        while (i < 1222) {
            t.advance();
            i++;
        }
        System.out.println(t);

    }
}
