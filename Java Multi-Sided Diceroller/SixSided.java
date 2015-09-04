import java.util.*;
public class SixSided
{
    Random roll=new Random();
    int sides=6;
    //Dice Constructor
    public SixSided()
    {
    }//End of Constructor

    //Rolls and returns the roll of the dice object.
    public int rollDice()
    {
            int numRolled=roll.nextInt(sides)+1;
            return numRolled;
    }//End rollDice
}
