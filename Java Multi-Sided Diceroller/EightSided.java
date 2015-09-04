import java.util.*;
public class EightSided
{
    Random roll=new Random();
    int sides=8;
    //Dice Constructor
    public EightSided()
    {
    }//End of Constructor

    //Rolls and returns the roll of the dice object.
    public int rollDice()
    {
            int numRolled=roll.nextInt(sides)+1;
            return numRolled;
    }//End rollDice
}
