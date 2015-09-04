import java.util.*;
class CharacterRaceGenerator
{


  public static void main(String[] args)
  {
    int Str;
    int Dex;
    int Con;
    int Int;
    int Wis;
    int Cha;
    
    Random rand = new Random();
    int sixSided = rand.nextInt(6)+1;
    int[] abilityScore = new int[6];
     for(CharacterRace race : CharacterRace.values())
     {
      System.out.println(race);
     } 
  }

  public int rollDieSix()
      {
        Random rand = new Random();
        int sixSided = rand.nextInt(6)+1;
        
        return sixSided;

        }
  }//end class character Generator
