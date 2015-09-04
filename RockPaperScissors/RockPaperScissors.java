import java.util.*;
class RockPaperScissors{

  public static void RockPaperScissors(){
  
  
    Random rand = new Random();
    int shakeFist = rand.nextInt(4);
    
    string computerResult;
      if(shakeFist == 1){
          computerResult = "rock";
       }
       else if(shakeFist == 2)
      {
         computerResult = "scissors";
      }
      else{
          computerResult = "paper";
      }
    
    System.out.println("Type in your selection: 1)Rock 2)Scissors 3)Paper");
    System.out.println("");
    
    string userResult;
    Scanner myScan = new Scanner(System.in);
    int userInput = myScan.nextInt();
      if(userInput == 1){
        userResult = "rock";
      }
      else if(userInput == 2)
      {
        userResult = "scissors";
      }
      else{
        userResult = "paper";
      }
    
    
    System.out.println("You selected " + userInput + "which is " + userInput + "."  );
    System.out.println("");
    System.out.println("The computer selected " + computerResult + "."  );
    
      if(userInput == shakeFist){
        System.out.println( "The result is a tie!");
      }
      else if(userInput == 1 && shakeFist == 2){
        System.out.println("Rock beats scissors.  Computer wins. ");
      }
      else if(userInput == 1 && shakeFist == 3){
        System.out.println("Paper covers rock.  You win! ");
      }
      else if(userInput == 2 && shakeFist == 1){
        System.out.println("Rocks beat scissors.  You win! ") ;
      }
  }

}