import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/10/17.
 */

//Parent player class
public abstract class Player {
    private String name;
    private Roshambo choice;

    public abstract Roshambo generateRoshambo();

    public String getName() {
        Scanner scnr = new Scanner(System.in);
        name = scnr.nextLine();
        return name;
    }

    public Roshambo getChoice() {
        return choice;
    }

}
