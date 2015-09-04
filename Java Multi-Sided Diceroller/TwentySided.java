import java.util.*;
public class TwentySided
{
    Random roll=new Random();
    int sides=20;
    //Dice Constructor
    public TwentySided()
    {
    }//End of Constructor

    //Rolls and returns the roll of the dice object.
    public int rollDice()
    {
            int numRolled=roll.nextInt(sides)+1;
            return numRolled;
    }//End rollDice
}
