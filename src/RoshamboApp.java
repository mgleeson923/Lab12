import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/10/17.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String repeat;

        System.out.println("Let's Play Rock, Paper, Scissors!");
        System.out.println();

        System.out.print("What is your name?: ");
        HumanPlayer name = new HumanPlayer();
        String userName = name.getName();
        System.out.println();

        do {
            System.out.print("Who would you like to play against? Player 1, or Player 2? (P1/P2): ");
            String playerChoice = scnr.nextLine();
            while (!playerChoice.equalsIgnoreCase("p1") && (!playerChoice.equalsIgnoreCase("p2"))) {
                System.out.print("Invalid Input. Would you like to play against Player 1 or Player 2? P1/P2:  ");
                playerChoice = scnr.nextLine();
                System.out.println();
            }

            ComputerPlayer1 player1 = new ComputerPlayer1();
            ComputerPlayer2 player2 = new ComputerPlayer2();
            HumanPlayer player3 = new HumanPlayer();

            Roshambo playerSelection = player3.generateRoshambo();
            Roshambo computerSelection1 = player1.generateRoshambo();
            Roshambo computerSelection2 = player2.generateRoshambo();

            if (playerChoice.equalsIgnoreCase("P1")) {
                System.out.println("Player 1: " + computerSelection1);
                System.out.println(userName + ": " + playerSelection);

                if (playerSelection.equals(computerSelection1)) {
                    System.out.println("Draw!");
                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {
                    System.out.println(userName + " loses!");
                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    System.out.println(userName + " wins!");
                }
            }

            if (playerChoice.equalsIgnoreCase("P2")) {
                System.out.println("Player 2: " + computerSelection2);
                System.out.println(userName + ": " + playerSelection);

                if (playerSelection.equals(computerSelection2)) {
                    System.out.println("Draw!");
                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {
                    if (computerSelection2.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " loses!");
                    } else {
                        System.out.println(userName + " wins!");
                    }
                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    if (computerSelection2.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " wins!");
                    } else {
                        System.out.println(userName + " loses!");
                    }
                } else if (playerSelection.toString().equalsIgnoreCase("Rock")) {
                    if (computerSelection2.toString().equalsIgnoreCase("Scissors")) {
                        System.out.println(userName + " wins!");
                    } else {
                        System.out.println(userName + " loses!");
                    }
                }
            }
            System.out.println();
            System.out.print("Would you like to play again? Y/N: ");
            repeat = scnr.nextLine();
            System.out.println();

            //validation on input
            while (!repeat.equalsIgnoreCase("Y") && (!repeat.equalsIgnoreCase("N"))) {
                System.out.print("Invalid Input. Would you like to play again? Y/N: ");
                repeat = scnr.nextLine();
                System.out.println();
            }

        } while (repeat.equalsIgnoreCase("Y"));

        System.out.println("Goodbye");
    }
}