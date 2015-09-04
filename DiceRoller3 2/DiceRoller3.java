//Brayden Green
import java.util.*;

class DiceRoller3 {

    public static void main(String[] args){
    
       System.out.println("Pressing a 0 inserts 1d4");
       System.out.println("Pressing a 1 inserts 1d6");
       System.out.println("Pressing a 2 inserts 1d8");
       System.out.println("Pressing a 3 inserts 110");
       System.out.println("Pressing a 4 inserts 1d12");
       System.out.println("Pressing a 5 inserts 1d20");
       System.out.println("Pressing a 6 rolls Dice Cup");
       System.out.println("Pressing a 7 exits program");
       
        Scanner InputDice = new Scanner(System.in);
        int i = InputDice.nextInt();
       
       Die[] DiceCup = new Die[6];
       DiceCup[0] = new Die(4);
       DiceCup[1] = new Die(6);
       DiceCup[2] = new Die(8);
       DiceCup[3] = new Die(10);
       DiceCup[4] = new Die(12);
       DiceCup[5] = new Die(20);
            
          while ( i < DiceCup.length)
          {
            System.out.println( DiceCup[i].sideUp );
            i++;
          }

    }

}

