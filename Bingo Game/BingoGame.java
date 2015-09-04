import java.util.*;

class BingoGame
{
    public static void main(String[] args){
        System.out.println("Welcome to Bingo!");
        System.out.println("");
        System.out.println("Player 1 enter your name:");
        Scanner myScan = new Scanner(System.in);
        String pOneName = myScan.next();
        System.out.println("");
        System.out.println("Player 2 enter your name:");
        String pTwoName = myScan.next();
        System.out.println("");
        BingoCard pOneCard = new BingoCard();
        BingoCard pTwoCard = new BingoCard();
        System.out.println("Let's get started, here are your cards!  " + pOneName + "'s card:");
        System.out.println("");
        System.out.println("B  I  N  G  O");
        pOneCard.BingoCard();
        pOneCard.printNumbers();
        System.out.println("");
        System.out.println("");
        System.out.println(pTwoName + "'s card:");
        System.out.println("");
        System.out.println("B  I  N  G  O");
        pTwoCard.BingoCard();
        pTwoCard.printNumbers();
        
        // DRAW BALLS 
        
        BingoBoard myBoard = new BingoBoard();
        int i=0;
        System.out.println("");
        System.out.println("Here come 5 random numbers:");
        while(i<6)
            {myBoard.drawBall();
                i++;
            }
        System.out.println("");
        System.out.println("Does either player have a bingo? 1. for YES, 2. for NO");
        int bingoYet = myScan.nextInt();
                if(bingoYet == 1){
        
                System.out.println("Does " + pOneName + " or " + pTwoName + " have the Bingo? 1. for " + pOneName + " and 2. for " + pTwoName + ".");
                int winner = myScan.nextInt();
                if(winner==1){
                    System.out.println(pOneName + " WINS!!!");
                }
                else{
                    System.out.println(pTwoName + " WINS!!!");
                }
                else{System.out.println("Here come 5 more balls!");
                  myBoard.drawBall();
                  myBoard.drawBall();
                  myBoard.drawBall();
                  myBoard.drawBall();
                  myBoard.drawBall();
                  System.out.println("Does either player have a bingo? 1. for YES, 2. for NO");
                  int bingoRepeat = myScan.nextInt();
               if(bingoYet == 1){
                  System.out.println("Does " + pOneName + " or " + pTwoName + " have the Bingo? 1. for " + pOneName + " and 2. for " + pTwoName + ".");
                  int winner = myScan.nextInt();
                   if(winner==1){
                    System.out.println(pOneName + " WINS!!!");
                    }
                    else{System.out.println(pTwoName + " WINS!!!");
                     }
         
                    }
                    else
                    {  
                    System.out.println("Here come 5 more balls!");
                     myBoard.drawBall();
                     myBoard.drawBall();
                     myBoard.drawBall();
                     myBoard.drawBall();
                     myBoard.drawBall();
                     System.out.println("Does either player have a bingo? 1. for YES, 2. for NO");
                    int bingoRepeat2 = myScan.nextInt();
                    }
                }
            }
}//end class BingoGame