import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/10/17.
 */

//Human Player class, subclass of Player. Produces a choice with validation
public class HumanPlayer extends Player {
    Scanner scnr = new Scanner(System.in);

    @Override
    public Roshambo generateRoshambo() {
        String userInput;
        Roshambo choice = null;
        System.out.print("Rock, Paper, or Scissors? (R/P/S): ");
        userInput = scnr.nextLine();
        System.out.println();
        while (!userInput.equalsIgnoreCase("r") && (!userInput.equalsIgnoreCase("p")) && (!userInput.equalsIgnoreCase("s"))) {
            System.out.print("Invalid Input. Rock, Paper, or Scissors? R/P/S:  ");
            userInput = scnr.nextLine();
            System.out.println();
        }

        if (userInput.equalsIgnoreCase("r")){
            choice = Roshambo.ROCK;

        }else if (userInput.equalsIgnoreCase("p")) {
            choice = Roshambo.PAPER;

        }else if (userInput.equalsIgnoreCase("s")) {
            choice = Roshambo.SCISSORS;
        }
        return choice;
    }
}
