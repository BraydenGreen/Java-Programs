//Brayden Green
import java.util.*;

class MonsterMaker{
  
  public static void main(String[] args){
  
     Weapon dagger = new Weapon("Dagger", "medium", "piercing","Light", "Small pointy object", 4, 2, 2, 10 );
     Weapon sling = new Weapon("Sling", "medium", "blunt", "ranged", "Sling, yo!", 6, 2, 2, 10 );
     Weapon greatAxe = new Weapon("Great Axe", "medium", "slashing", "Heavy", "An axe that is great", 12, 20, 3, 5);
     Weapon handAxe = new Weapon("Hand Axe", "medium", "slashing", "One-handed", "An axe that slashes", 6, 10, 3, 5);
     
     int[] koboldAttackBonus = new int [2];
     koboldAttackBonus[0] = 5; 
     koboldAttackBonus[1] = 6;
     
     int[] koboldDamageBonus = new int [2];
     koboldDamageBonus[0] = 3; 
     koboldDamageBonus[1] = 3;
     
     Weapon[] koboldEquippedWeapons = new Weapon [2];
     koboldEquippedWeapons[0] = dagger;
     koboldEquippedWeapons[1] = sling;
     
     int[] orcAttackBonus = new int [2];
     orcAttackBonus[0] = 8; 
     orcAttackBonus[1] = 7;
     
     int[] orcDamageBonus = new int [2];
     orcDamageBonus[0] = 3; 
     orcDamageBonus[1] = 3;
     
     Weapon[] orcEquippedWeapons = new Weapon [2];
     orcEquippedWeapons[0] = greatAxe;
     orcEquippedWeapons[1] = handAxe;
     
     
     Monster koboldSlinger = new Monster("Kobold Slinger", "Small natural humanoid", 1, 100, 3, 24, 13, 6, "Evil", 30, koboldAttackBonus, koboldDamageBonus, koboldEquippedWeapons );
     Monster orcRaider = new Monster("Orc Raider", "Medium natural humanoid", 3, 150, 5, 46, 17, 6, "chaotic evil", 350, orcAttackBonus, orcDamageBonus, orcEquippedWeapons );
     
     int[] koboldAttack = koboldSlinger.rollForAttack();
     int[] koboldDamage = koboldSlinger.rollForDamage();
     
     
     int[] orcAttack = orcRaider.rollForAttack();
     int[] orcDamage = orcRaider.rollForDamage();
     
     System.out.println("Kobold initiative roll: " + koboldSlinger.rollForInit() );
     System.out.println("Kobold dagger attack roll: " + koboldAttack[0] );
     System.out.println("Kobold dagger damage roll: " + koboldDamage[0] );
     System.out.println("Kobold sling attack roll: " + koboldAttack[1] );
     System.out.println("Kobold sling damage roll: " + koboldDamage[1] );
     
     System.out.println("Kobold hit points: " + koboldSlinger.hp );
     
     System.out.println("Orc initiative roll: " + orcRaider.rollForInit() );
     System.out.println("Orc great axe attack roll: " + orcAttack[0] );
     System.out.println("Orc great axe damage roll: " + orcDamage[0] );
     System.out.println("Orc hand axe attack roll: " + orcAttack[1] );
     System.out.println("Orc hand axe damage roll: " + orcDamage[1] );
     
     System.out.println("Orc hit points: " + orcRaider.hp );
  
  }//end main method

}//end class monster maker