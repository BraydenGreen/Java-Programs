//Brayden Green
import java.util.*;

class ArmorTester {

  public static void main(String[] args){
  
      Armor padded = new Armor("Padded", 5, 1, 8, 0, 5, 30, 20, 10);
      Armor leather = new Armor("Leather", 10, 2, 6, 0, 10, 30, 20, 15);
      Armor studdedLeather = new Armor("Studded Leather", 25, 3, 5, -1, 15, 30, 20, 20);
      
      int paddedSpeed = padded.getSpeed("Human");
      boolean paddedFail;
      System.out.println("A human wearing padded armor has a standard speed of " + paddedSpeed);
      paddedFail= padded.arcaneSpellFailed();
      System.out.println(paddedFail);
      
      
      int leatherSpeed = leather.getSpeed("Dwarf");
      boolean leatherFail;
      System.out.println("A Dwarf wearing padded armor has a standard speed of " + leatherSpeed);
      leatherFail = leather.arcaneSpellFailed();
      System.out.println(leatherFail);
      
      int studdedLeatherSpeed = studdedLeather.getSpeed("Elf");
      boolean studdedLeatherFail;
      System.out.println("An Elf wearing padded armor has a standard speed of " + studdedLeatherSpeed);
      studdedLeatherFail = leather.arcaneSpellFailed();
      System.out.println(studdedLeatherFail);

  }//end main class

}//end class ArmorTester