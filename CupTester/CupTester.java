//Brayden Green
class CupTester{

  public static void main (String[] args){
  
    DiceCup myDiceCup = new DiceCup();  //create DiceCup and Dice
    
    Die d6 = new Die(6);
    Die d8 = new Die(8);
    Die d12 = new Die(12);
    Die d20 = new Die(20);
    Die d4 = new Die(4);
    
    Die[] newDice = {d6, d8, d12, d20, d4}; //put dice inside cup
    myDiceCup.dice = newDice;
    
    myDiceCup.shakeDiceCup(); //call shake method
    
    //access side up field and print out dispplay
    System.out.println( d6.sideUp );
    System.out.println( d8.sideUp );
    System.out.println( d12.sideUp );
    System.out.println( d20.sideUp );
    System.out.println( d4.sideUp );
    
  }//end main

}//end CupTester