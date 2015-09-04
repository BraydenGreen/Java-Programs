import java.util.*;
public class TenSided
{
    Random roll=new Random();
    int sides=10;
    //Dice Constructor
    public TenSided()
    {
    }//End of Constructor

    //Rolls and returns the roll of the dice object.
    public int rollDice()
    {
            int numRolled=roll.nextInt(sides)+1;
            return numRolled;
    }//End rollDice
}
