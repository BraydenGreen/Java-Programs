import java.util.*;

class BingoBoard
{
  //fields
  private boolean ballsPulled;
  BingoCard bingoCard;
  
  //constructors
  public BingoBoard(){} //end constructor
  
  //methods
  public void resetGame(){}// end resetGame
  
  public int drawBall()
  {
      Random rand = new Random();
      int ballDrawn = rand.nextInt(75)+1;
      
      System.out.print("");
      System.out.print(ballDrawn + " " );
      
          return ballDrawn;    
  }// end draw Ball

//public boolean checkBingo(){
    // change void up there to booolean after test.
    
    // THere needs to be a method here that once a ball is drawn, it reports it here and changes the default  from false to true.

//}// end checkBingo


//public boolean[] getAllBallsDrawn(int drawBall){
// this needs to be a boolean[] return type



//}// end method getAll Balls Drawn


}// end class bingo board

