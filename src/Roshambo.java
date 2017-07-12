/**
 * Created by michaelgleeson on 7/10/17.
 */

//enum that generates the choices
public enum Roshambo {
    ROCK ("Rock"), PAPER ("Paper"), SCISSORS ("Scissors");

    private String choiceName;

    Roshambo(String choiceName) {
        this.choiceName = choiceName;
    }

    @Override
    public String toString () {
        return choiceName;
    }


}
