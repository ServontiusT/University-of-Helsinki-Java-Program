/*
In the exercise template there is a ready-made class TelevisionProgram, representing a television program.
The class has object variables name and duration, a constructor, and a few methods.

Implement a program that begins by reading television programs from the user.
When the user inputs an empty string as the name of the program, the program stops reading programs.

After this the user is queried for a maximum duration.
Once the maximum is given,
the program proceeds to list all the programs whose duration is smaller or equal to the specified maximum duration.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("");
            String programName = scanner.nextLine();

            if(programName.isEmpty()) {
                break;
            } else {
                System.out.print("");
                int programDuration = Integer.parseInt(scanner.nextLine());

                TelevisionProgram currentLineup = new TelevisionProgram(programName, programDuration);
                programs.add(currentLineup);
            }
        }

        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for(TelevisionProgram program: programs) {
            if(program.getDuration() <= maxDuration) {
                System.out.println(program.getName());
            }
        }
    }
}
