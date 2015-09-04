//Brayden Green 
import java.util.*;

class Armor{

    //fields
    String armorName;
    public int armorCost;
    public int acBonus;
    public int maxDexBonus;
    public int acPenalty;
    public int spellFailure;
    public int speedFast;
    public int speedSlow;
    public int weight;
    String raceType;
    
    //Constructors

    public Armor(String armorName, int armorCost, int acBonus, int maxDexBonus, int acPenalty, int spellFailure, int speedFast,  int speedSlow, int weight)
    {
        this.armorName = armorName;
        this.armorCost = armorCost;
        this.acBonus = acBonus;
        this.maxDexBonus = maxDexBonus;
        this.acPenalty = acPenalty;
        this.spellFailure = spellFailure;
        this.speedFast = speedFast;
        this.speedSlow = speedSlow;
        this.weight = weight;
    } //end Armor constructor

    public int getSpeed(String raceType){
        int returnspeed = 0;
       switch(raceType) 
       {
        case "Human", "Elf", "Half-elf", "Half-elf": returnspeed = speedFast;
            break;
        case "Dwarf, Gnome, Halfling": returnspeed = speedSlow;
            break;            
        }//end switch raceType
        return returnspeed;   
    }//end getSpeed method
    
    public boolean arcaneSpellFailed(){
        boolean returnboolean = true;
        int rollNumber;
        Random rand = new Random();
        rollNumber = rand.nextInt(100);
        rollNumber++;
          if(rollNumber < spellFailure){
              return false;
          }
          else if (rollNumber > spellFailure){
              return true;
          }//end if statement
    }//end arcaneSpellFailed method

}// end class Armor

