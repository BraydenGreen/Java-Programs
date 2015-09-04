import java.util.*;
class Many_Way_Dungeon{

    public static void main(){
    
    oneEntrance();
    
    
    
    }//end one way dungeon main
    public static void oneEntrance()
    {
        System.out.println("You walk towards the entrance of the deceased Dragon's Lair, looking for his treasure room.");
        System.out.println("You find yourself in a large room with armored statues in each corner.  There are four doors to choose from, and stairways leading down to the exit. One door leads to the north, and there are two on the eastern wall and one on the southern wall.   Which way do you want to go?");
        System.out.println("1. North");
        System.out.println("2. Top door facing east");
        System.out.println("3. Bottom door facing east");
        System.out.println("4. Door on southern wall");
        
        CinReader myReader = new CinReader();
        int whichWay = myReader.readInt(1,4);
        
        switch(whichWay)
        {
        case 1: threePit();
            break;
        case 2: fiveHallway();
            break;
        case 3: eightEightDoors();
            break;
        case 4: fourMouthRoom();
            break;
        }
    }//end oneEntrance
    
    public static void twoHallway(){
        System.out.println("You find yourself in a large room with armored statues in each corner.  There are four doors to choose from, and stairways leading down to the exit. One door leads to the north, and there are two on the eastern wall and one on the southern wall.   Which way do you want to go?");
        System.out.println("1. North");
        System.out.println("2. Top door on the east wall.");
        System.out.println("3. Bottom door on the east wall.");
        System.out.println("4. Door on southern wall.");
    
        CinReader myReader = new CinReader();
        int whichWay = myReader.readInt(1,4);
    
        switch(whichWay)
        {
    
        case 1: threePit();
            break;
        case 2: fiveHallway();
            break;
        case 3: eightEightDoors();
            break;
        case 4: fourMouthRoom();
            break;
        }
    }
    
    public static void threePit()
    {
    System.out.println("You fall down into a pit and everything goes dark around you.");
        if(playerDeath() == false)
        {
            System.out.println("You catch yourself on a rock and are able to hoist yourself up, avoiding certain death, and climb back into the large room.");
            System.out.println("");
            twoHallway();
        }
        else{
            System.out.println("You wait for days but nobody comes to get you out.");
            System.out.println("");
            System.out.println("Play again? 1 for yes and 2 to exit:");
            CinReader myReader = new CinReader();
            int playAgain = myReader.readInt(1,2);
    
        if(playAgain == 1){
            oneEntrance();
        }
        else{
            System.out.println("Thanks for playing! Play again soon!");
            }
    
        }
    }
    
    public static void fourMouthRoom(){
        System.out.println("You enter the room and run into a large mouth, which tries to devoure you.");
         if(playerDeath() == false)
          {
            System.out.println("You poke it in the eye and run back into the room while it is distracted and close the door. ");
            System.out.println("");
            twoHallway();
          }
         else{
            System.out.println("You were a tasy meal!");
            System.out.println("");
            System.out.println("Play again? 1 for yes and 2 to exit:");
            CinReader myReader = new CinReader();
            int playAgain = myReader.readInt(1,2);
          if(playAgain == 1){
            oneEntrance();
            }
          else{
            System.out.println("Thanks for playing! Play again soon!");
          }
        }
    }

    public static void fiveHallway()
    {
        System.out.println("You are in a long hallway lined with bones and skeletons that has a door to the east and to the west that directly oppose each other in a straight line.  There is also a door near the east door that is facing north and seems to shimmer a little from underneath the doorway. Which do you choose to enter?");
        System.out.println("1. The door that leads to the west.");
        System.out.println("2. The door that leads to the east.");
        System.out.println("3. The door that leads to the north and shimmers a little.");
        CinReader myReader = new CinReader();
        int whichWay = myReader.readInt(1,3);
        switch(whichWay)
        {
        case 1: twoHallway();
            break;
        case 2: sevenTreasureRoom();
            break;
        case 3: sixMagicPortal();
        }
    }// end class fiveHallway
    
    public static void sixMagicPortal()
    {
        System.out.println("You found a magic portal and have teleported out of the dragon's lair.");
        System.out.println("");
        System.out.println("Play again? 1 for yes and 2 to exit:");
        CinReader myReader = new CinReader();
        int playAgain = myReader.readInt(1,2);
        if(playAgain == 1){
            oneEntrance();
        }
        else if(playAgain == 2)
        {
        System.out.println("Thanks for playing! Play again soon!");
        }
    }
    
    public static void sevenTreasureRoom()
    {
        System.out.println("You found the treasure and WON THE GAME!!!");
        System.out.println("");
        System.out.println("Play again? 1 for yes and 2 to exit:");
        CinReader myReader = new CinReader();
        int playAgain = myReader.readInt(1,2);
        if(playAgain == 1){
            oneEntrance();
        }
        else if(playAgain == 2)
        {
        System.out.println("Thanks for playing! Play again soon!");
        }
    }

    public static void eightEightDoors()
    {
        System.out.println("You find a long hallway that turns the corner.  Turning the corner south you see 8 doors, four on the left and four on the right.");
        System.out.println("Which door would you like to choose?");
        System.out.println("1. The first door on the left.");
        System.out.println("2. The second door on the left.");
        System.out.println("3. The third door on the left.");
        System.out.println("4. The fourth door on the left.");
        System.out.println("5. The last door on the right.");
        System.out.println("6. The second to last door on the right.");
        System.out.println("7. The second closest door on the right.");
        System.out.println("8. The closest door on the right.");
        CinReader myReader = new CinReader();
        int whichWay = myReader.readInt(1,8);
        switch(whichWay)
        {
        case 1: nineNinthHell();
            break;
        case 2: tenTenthHell();
            break;
        case 3: elevenFireTrap();
            break;
        case 4: twelveGasTrap();
            break;
        case 5: thirteenHeaven();
            break;
        case 6: fourteenSpiked();
            break;
        case 7: fifteenSixthHell();
            break;
        case 8: sixteenFire();
        }
    }

    public static void nineNinthHell()
    {
        System.out.println("You see lights flashing and enticing voices ahead.");
        System.out.println("");
        if(playerDeath() == false)
        {
            System.out.println("You think it might be better not to go in there, and turn back around. ");
            System.out.println("");
            eightEightDoors();
        }
        else{
            System.out.println("You were pulled into the ninth circle of Hell.  Good luck! This potion of the game is over.");
            System.out.println("");
            System.out.println("Would you like to start over? 1 for yes and 2 to exit:");
            CinReader myReader = new CinReader();
            int playAgain = myReader.readInt(1,2);
        if(playAgain == 1){
            oneEntrance();
        }
        else{
    
            System.out.println("Thanks for playing! Play again soon!");
        }
        }
    }
    
    public static void tenTenthHell()
    {
        System.out.println("You see lights flashing and voices ahead.");
        System.out.println("");
        if(playerDeath() == false)
            {
            System.out.println("You think it might be better not to go in there, and turn back around. ");
            System.out.println("");
            eightEightDoors();
        }
        else{
            System.out.println("You were pulled into the tenth plane of Hell.  Good luck! This potion of the game is over.");
            System.out.println("");
            System.out.println("Would you like to start over? 1 for yes and 2 to exit:");
            CinReader myReader = new CinReader();
            int playAgain = myReader.readInt(1,2);
        if(playAgain == 1){
            oneEntrance();
        }
        else{
            System.out.println("Thanks for playing! Play again soon!");
        }
    
        }
    }

    public static void elevenFireTrap()
    {
        System.out.println("You hear a click as you open the door, and flames surround you.");  
        System.out.println("");
        if(playerDeath() == false)
        {
            System.out.println("Showing a great deal of athletic ability, you dive out the door with only your eyebrows burned.");
            System.out.println("");
            eightEightDoors();
        }
        else{
            System.out.println("You were burnt to a crisp.  Before you move on you think that you actually smell pretty good cooked!");
            System.out.println("");
            System.out.println("Would you like to play again? 1 for yes and 2 to exit:");
            CinReader myReader = new CinReader();
            int playAgain = myReader.readInt(1,2);
        }
        if(playAgain == 1){
            oneEntrance();
        }
        else{
    
            System.out.println("Thanks for playing! Play again soon!");
        }
        }
    }
    
    public static void twelveGasTrap(){
        System.out.println("You hear a click as you open the door, and gasses surround you."); 
        System.out.println("");
        if(playerDeath() == false)
        {
            System.out.println("Showing a great deal of athletic ability, you dive out the door wheezing for clean air.");
            System.out.println("");
            eightEightDoors();
        }
        else{
            System.out.println("You breathe the gasses in, and feel very happy. Unfotunately that is the last thing you feel in this existence.");
            System.out.println("");
            System.out.println("Would you like to play again? 1 for yes and 2 to exit:");
            CinReader myReader = new CinReader();
            int playAgain = myReader.readInt(1,2);
        if(playAgain == 1){
            oneEntrance();
        }
        else{
            System.out.println("Thanks for playing! Play again soon!");
        }
        }
    }
    
    public static void thirteenHeaven(){
        System.out.println("You hear angels singing as you open the door, and you step into the light.  You find yourself surrounded by the ones that you have lost in life, and you feel very happy.  You win.");
        System.out.println("");
        System.out.println("Play again? 1 for yes and 2 to exit:");
        CinReader myReader = new CinReader();
        int playAgain = myReader.readInt(1,2);
            if(playAgain == 1){
                oneEntrance();
            }
            else if(playAgain == 2){
              System.out.println("Thanks for playing! Play again soon!");
            }
    }
    
    public static void fourteenSpiked(){
        System.out.println("You hear hear a click as you open the door, and the floor opens to reveal a bunch of spikes, which you fall on.  GAME OVER.");
            if(playerDeath() == false)
            {
            System.out.println("Amazingly enough you land in-between the spikes and are able to climb up and out of the room.");
            System.out.println("");
            eightEightDoors();
            }
            else{
            System.out.println("You die.  It's pretty gross.  Use your imagination.");
            System.out.println("");
            System.out.println("Would you like to play again? 1 for yes and 2 to exit:");
            CinReader myReader = new CinReader();
            int playAgain = myReader.readInt(1,2);
            if(playAgain == 1){
            oneEntrance();
            }
            else{
            System.out.println("Thanks for playing! Play again soon!");
            }
        }
    }

    public static void fifteenSixthHell(){
        System.out.println("You see lights flashing and voices ahead.");
        System.out.println("");
         if(playerDeath() == false)
          {
            System.out.println("You think it might be better not to go in there, and turn back around. ");
            System.out.println("");
            eightEightDoors();
          }
         else{
            System.out.println("You were pulled into the sixth plane of Hell.  Good luck! This potion of the game is over.");
            System.out.println("");
            System.out.println("Would you like to start over? 1 for yes and 2 to exit:");
            CinReader myReader = new CinReader();
            int playAgain = myReader.readInt(1,2);
         if(playAgain == 1){
            oneEntrance();
         }
         else{
            System.out.println("Thanks for playing! Play again soon!");
            }
        }
    }

    public static void sixteenFire()
    {
        System.out.println("You warm yourself in the fire, and are completely unaware as the goblins sneak behind you and tie you up for their next meal! GAME OVER.3");
        System.out.println("You see lights flashing and voices ahead.");
        System.out.println("");
            if(playerDeath() == false)
            {
            System.out.println("You make quick work of the goblins, and walk back into the hall. ");
            System.out.println("");
            eightEightDoors();
             }
            else{
            System.out.println("The goblins cry out in victory.  'The longshanks is dead.  WE WILL EAT THE LONGSHANKS!");
            System.out.println("");
            System.out.println("Would you like to play again? 1 for yes and 2 to exit:");
            CinReader myReader = new CinReader();
            int playAgain = myReader.readInt(1,2);
        
             if(playAgain == 1){
                oneEntrance();
                }
            else{
                System.out.println("Thanks for playing! Play again soon!");
            }
        }
    }
    
    public static boolean playerDeath(){
      Random rand = new Random();
      int dsRoll = rand.nextInt(100);
        if (dsRoll <= 75 )
        {
        return false;
        }
        else
        return true;
    }//end deathSave



}// end class one way dungeon