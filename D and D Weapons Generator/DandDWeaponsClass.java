import java.util.*;

class Weapon
    {
    //Field
       public String weaponName;
       public String size;
       public String type;
       public String category;
       public String description;
       int cost;
       int dmg;
       int crit;
       int range;



    //Constructors
      public Weapon(String weaponName, String size, String type, String category, String description, int dmg, int cost, int crit, int range)
      {
         this.weaponName = weaponName;
         this.size = size;
         this.type = type;
         this.category = category;
         this.description = description;
         this.cost = cost;
         this.dmg = dmg;
         this.crit = crit;
         this.range = range;
      }
      //Methods
      public int getDamage()
      {
         int randomNumber;
         Random random = new Random();
         randomNumber = random.nextInt(dmg);
         int totalDmg;
         totalDmg = randomNumber + 1;
         return totalDmg;
      }
}