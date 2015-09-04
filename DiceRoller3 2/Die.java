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
    	}//End constructor
    
 //Methods
    	public void roll()
    	{
          randomGenerator = new Random();
          sideUp = randomGenerator.nextInt(sides);
          
         
    	}//End roll
    

}//End class Die