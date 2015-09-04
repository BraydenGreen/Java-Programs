import java.util.*;
class Monster{

//fields 
  public String monsterName;
  public String monsterDescrip;
  public int monsterLevel;
  public int xpBonus;
  public int init;
  public int hp;
  public int ac;
  public int speed;
  public String alignment;
  public int gp;
  public int[] attackBonus;
  public int[] damageBonus;
  public Weapon[] equippedWeapons;

  //constructors
  public Monster(String monsterName, String monsterDescrip, int monsterLevel, int xpBonus, int init, int hp, int ac, int speed, String alignment, int gp, int[] attackBonus, int[] damageBonus, Weapon[] equippedWeapons ){
    this.monsterName = monsterName;
    this.monsterDescrip = monsterDescrip;
    this.monsterLevel = monsterLevel;
    this.xpBonus = xpBonus;
    this.init = init;
    this.hp = hp;
    this.ac = ac;
    this.speed = speed;
    this.alignment = alignment;
    this.gp = gp;
    this.attackBonus = attackBonus;
    this.damageBonus = damageBonus;
    this.equippedWeapons = equippedWeapons;
  }

//methods

  public int rollForInit(){
    int monsterInitRoll;
    Random initRoll = new Random();
    monsterInitRoll = initRoll.nextInt(20)+init;
    monsterInitRoll++;

    return monsterInitRoll;
  }// end roll for Init method



  public int[] rollForAttack(){
    int[] returnAttacks = new int [equippedWeapons.length];
    int i = 0;
    Random attackRoll = new Random();   
     while( i < equippedWeapons.length){
         returnAttacks[i] = attackRoll.nextInt(20)+1+attackBonus[i];
         i++;
     }
  
     return returnAttacks;
  }//end roll for attack method

  public int[] rollForDamage(){
    int i = 0;
    int[] damage = new int[equippedWeapons.length]; 
     
     while( i < equippedWeapons.length){
          damage[i] = equippedWeapons[i].getDamage() + attackBonus[i];
         i++;
     }
  
    return damage;
  }// end roll for Damage method

  public void takeDamage(int damage){
    this.hp = hp - damage;
  }// end method take damage

}//end Monster class