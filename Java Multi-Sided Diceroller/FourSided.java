import java.util.*;
public class FourSided
{
    Random roll=new Random();
    int sides=4;
    //Dice Constructor
    public FourSided()
    {
    }//End of Constructor

    //Rolls and returns the roll of the dice object.
    public int rollDice()
    {
            int numRolled=roll.nextInt(sides)+1;
            return numRolled;
    }//End rollDice
}
