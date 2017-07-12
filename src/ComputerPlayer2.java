/**
 * Created by michaelgleeson on 7/10/17.
 */
//sublcass of Player, chooses Rock, Paper, Scissors randomly based on RNG
public class ComputerPlayer2 extends Player {

    @Override
    public Roshambo generateRoshambo() {
        int randNum = (int) (Math.random() * 2);

        switch (randNum) {
            case 0:
                return Roshambo.ROCK;
            case 1:
                return Roshambo.PAPER;
            case 2:
                return Roshambo.SCISSORS;
            default:
                System.out.println("Something trainwrecked");
                break;
        }
        return null;
    }
}
