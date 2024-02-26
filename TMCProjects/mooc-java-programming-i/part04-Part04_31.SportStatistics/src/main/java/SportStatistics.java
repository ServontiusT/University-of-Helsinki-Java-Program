/*
Write a program that prompts the user for a filename, after which it reads the match statistics from the file.
The program then prompts the user for the name of a team, and prints the data specified in the following parts for that team.

Part 1:
Implement the ability to output the number of games played by any given team. We're using the above-mentioned data.csv file.

Part 2:
Extend the program so that it has the ability to print the number of wins and losses of a given team.
The winner of a game is the team that has gained more points from it.

You may assume that the games cannot be tied. Below, we're using the above-mentioned data.csv file.
 */

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        Scanner inputFile = new Scanner(Paths.get(scan.nextLine()));

        System.out.println("Team:");
        String teamName = scan.nextLine();
        int gameCounter = 0;
        int gamesWon = 0;
        int gamesLost = 0;

        while (inputFile.hasNextLine()) {
            String line = inputFile.nextLine();

            if (line.isEmpty()) {
                break;
            } else if (line.contains(teamName)){
                gameCounter++;

                String[] teamMatch = line.split(",");

                String homeTeam = teamMatch[0];
                String awayTeam = teamMatch[1];
                int homeTeamScore = Integer.parseInt(teamMatch[2]);
                int awayTeamScore = Integer.parseInt(teamMatch[3]);

                if (homeTeam.equals(teamName)) {
                    if (homeTeamScore > awayTeamScore) {
                        gamesWon++;
                    } else {
                        gamesLost++;
                    }
                } else if (awayTeam.equals(teamName)) {
                    if (awayTeamScore > homeTeamScore) {
                        gamesWon++;
                    } else {
                        gamesLost++;
                    }
                }
            }
        }

        System.out.println("Games: " + gameCounter);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLost);
    }
}
