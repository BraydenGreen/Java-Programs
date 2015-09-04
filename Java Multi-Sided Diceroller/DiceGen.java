import java.util.*;

class DiceGen
{
public static int sides;
Random roll=new Random();
public DiceGen(int sides)
{
this.sides=sides;
}
public int rollDice(int rollOut)
{
return roll.nextInt(sides)+1;
}
}
