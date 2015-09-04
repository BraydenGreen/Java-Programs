import java.util.*;
class DiceRoller
{
    public static void main(String [] args)
    {
        int rollInc=0;
        Scanner input=new Scanner(System.in);
        FourSided fourSided=new FourSided();
        SixSided sixSided=new SixSided();
        EightSided eightSided=new EightSided();
        TenSided tenSided=new TenSided();
        TwelveSided twelveSided=new TwelveSided();
        TwentySided twentySided=new TwentySided();
        
        System.out.println("What size die do you want to roll?");
        int inputRoll=input.nextInt();
    if (inputRoll==4 || inputRoll==6 || inputRoll==10 || inputRoll==12 || inputRoll==20)
    {
        System.out.println("How many times would you like to roll it?");
        int numOfRolls=input.nextInt();
        if (inputRoll==4)
        {
        while (rollInc<numOfRolls)
        {
        rollInc++;
        System.out.println("Roll "+rollInc+" was "+fourSided.rollDice());
        }
    }
       if (inputRoll==6)
        {
        while (rollInc<numOfRolls)
        {
        rollInc++;
        System.out.println("Roll "+rollInc+" was "+sixSided.rollDice());
        }
    }
       if (inputRoll==8)
        {
        while (rollInc<numOfRolls)
        {
        rollInc++;
        System.out.println("Roll "+rollInc+" was "+eightSided.rollDice());
        }
    }
       if (inputRoll==10)
        {
        while (rollInc<numOfRolls)
        {
        rollInc++;
        System.out.println("Roll "+rollInc+" was "+tenSided.rollDice());
        }
    }
       if (inputRoll==12)
        {
        while (rollInc<numOfRolls)
        {
        rollInc++;
        System.out.println("Roll "+rollInc+" was "+twelveSided.rollDice());
        }
    }
       if (inputRoll==20)
        {
        while (rollInc<numOfRolls)
        {
        rollInc++;
        System.out.println("Roll "+rollInc+" was "+twentySided.rollDice());
        }
    }
    }
else
{
System.out.println("Please re-run the dice roller and input a valid die size. (4,6,8,10,12,20)");
}
}
}
