import java.util.Random;
class Die
{
 //Fields
  public int sides;
  public int sideUp;
    
 //Constructors
	public Die(int sides)
	{
         // initialise all fields
    this.sides = sides;
      roll();
  }//End constructor
    
 //Methods
  public void roll(){
    java.util.Random randomGenerator = new Random();
    sideUp = randomGenerator.nextInt(sides) +1 ;
  }//End roll
    
}//End class Die