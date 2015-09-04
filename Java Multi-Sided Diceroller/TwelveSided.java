import java.util.*;
public class TwelveSided
{
    Random roll=new Random();
    int sides=12;
    //Dice Constructor
    public TwelveSided()
    {
    }//End of Constructor

    //Rolls and returns the roll of the dice object.
    public int rollDice()
    {
            int numRolled=roll.nextInt(sides)+1;
            return numRolled;
    }//End rollDice
}
