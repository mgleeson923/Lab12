/**
 * Created by michaelgleeson on 7/10/17.
 */

//sublcass of Player, only chooses Rock
public class ComputerPlayer1 extends Player {

    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }
}
