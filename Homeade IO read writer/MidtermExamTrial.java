import java.io.*;
import java.util.*;
class MidtermExamTrial{

    public static void main(String[] args){    
    
        Date date = new Date();   
        Calendar calendar = GregorianCalendar.getInstance(); 
        calendar.setTime(date); 
        System.out.println(date);
        
        
        CinReader myCinReader = new CinReader();
        int answerTotal = 0;
        int cashTotal = 0;
        //                                           QUESTION #1
         
        System.out.println("Hello, and welcome to WHO WANTS TO BE A BASIC PROGRAMMER!");
        System.out.println("");
        System.out.println("What is your name?");
        String nameInput = myCinReader.readString();
        System.out.println("");
        System.out.println("Here comes your first quesiton, and it's worth $100.");
        System.out.println("The java language can be used to program which types of machines?");
        System.out.println("1  A) Computers");
        System.out.println("2  B) Washing Machines");
        System.out.println("3  C) Traffic Lights");
        System.out.println("4  D) All of the above");
        System.out.println("(Enter your choice 1 through 4)");
        System.out.println("");
        int questionOneInput = myCinReader.readInt(1,4);
        String questionOneResult;
    
         if ( questionOneInput != 4){
                 questionOneResult = "Incorrect.  Good luck on the next one!";
                 System.out.println(questionOneResult);
                 }
             else if( questionOneInput == 4){
                 questionOneResult  = "CORRECT! YOU JUST WON $100 !!!";
                 answerTotal++;
                 cashTotal = cashTotal + 100;
                 System.out.println(questionOneResult);
             }
        System.out.println("");    
        System.out.println("");
        
        //                                          QUESTION #2
        
        System.out.println("Here comes your next question, and it's worth $200.");
        System.out.println("If you wanted to initialize a number to a field, which would be the most appropriate selection?");    
        System.out.println("1) i = 0;  ");    
        System.out.println("2) nexInt();  ");
        System.out.println("3) int  ");
        System.out.println("4) initNumber = 0;  ");
        int questionTwoInput = myCinReader.readInt(1,4);
        String questionTwoResult;
        if(questionTwoInput == 3){
            answerTotal++;
            cashTotal = cashTotal + 200;
            questionTwoResult  = "YOU GOT IT!!! YOU JUST WON 200!!!";
            System.out.println(questionTwoResult);
        }
        else if(questionTwoInput != 3){
            questionTwoResult  = "Hmmmmm..... That wasn't the right choice.... Get ready for the next question!";
            System.out.println(questionTwoResult);
        
        }
        
        
        //                                  QUESTION #3                          
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("Here comes your next question! Ya ready? It's worth $400!");
        System.out.println("If you had a class named TheGoodGuy that had a method called getsTheGirl(), and you wanted to give *only* the properties of that method to your new class TheBadGuy, which one below would you use?");
        System.out.println("1  A) TheGoodGuy TheBadGuy = new TheGoodGuy(getsTheGirl);");
        System.out.println("2  B) TheBadGuy.getsTheGirl();");
        System.out.println("3  C) this.TheBadGuy = TheBadGuy + getsTheGirl();");
        System.out.println("4  D) TheBadGuy <= TheGoodGuy.getsTheGirl();");
        System.out.println("");
        
        int questionThreeInput = myCinReader.readInt(1,4);
        String questionThreeResult;
            if(questionThreeInput != 2){
        
             questionThreeResult = "Sorry, that isn't the right choice.  Maybe the next will be better for you!" ;
             System.out.println(questionThreeResult);
             }
            else if(questionThreeInput == 2){
                answerTotal++;
                cashTotal = cashTotal + 400;
                questionThreeResult  = "CORRECTAMUNDO!!! YOU JUST WON $400";
            System.out.println(questionThreeResult);
            
        }
        
        System.out.println("");
        System.out.println("");
            if(answerTotal < 1){
             System.out.println("You haven't earned any money yet, but let's see how your luck changes in the ESSAY section!");
           }
            else {
            System.out.println("So far you have " + answerTotal + " questions answered right, and have earned " + cashTotal + " hundred dollars!");
           }
        
                                                    //Question #4
                                            
        System.out.println("Question 4 is worth $800.  Here it comes <<LIGHTS DIM>>");
        System.out.println("");
        System.out.println("If your java class was named Jabberwocky, what would it's full saved name be?");
        String questionFourInput = myCinReader.readString();
        
        System.out.println("");
        System.out.println("Your answer will be printed out and sent to the judges. NEXT QUESTION!!!");
        System.out.println("");
        
        
                                                    //Question #5
        
        
        System.out.println("This question will be wort;h $1600.  How can you tell if a method is a mutator method?");
        String questionFiveInput = myCinReader.readString();
        System.out.println("");
        System.out.println("Your answer will be printed out and sent to the judges. Here comes the next one, and it is worth $3200!!! ");
        
                                                
                                                // Question #6
        
        System.out.println("");
        System.out.println("What is the difference between a default constructor and a custom constructor?");
        System.out.println("");
        String questionSixInput = myCinReader.readString();
        System.out.println("Your answer will be printed out and sent to the judges. Here comes the next one, and it is worth $6400!!! ");
        
                                                //Question #7
        System.out.println("");
        System.out.println("If a sword object had a method named 'magic', how would you call the method?");
        System.out.println("");
        String questionSevenInput = myCinReader.readString();
        System.out.println("Your answer will be printed out and sent to the judges. Here comes the next one, and it is worth $15,000!!! ");
        
                                                //Question #8
              
        System.out.println("");
        System.out.println("Write a class called Dragon to show proper documentation: write the class on one line in order for it to record ");
        System.out.println("");
        String questionEightInput = myCinReader.readString();
        System.out.println("Your answer will be printed out and sent to the judges. Here comes the next one, and it is worth $30,000!!! ");
        
                                                //Question #9
        System.out.println("");
        System.out.println("Write a class called DungeonMaster that has a method that allows dice to be rolled: ");
        System.out.println("");
        String questionNineInput = myCinReader.readString();
        System.out.println("Your answer will be printed out and sent to the judges. Here comes the next one, and it is worth $60,000!!! ");
        
                                                // Question #10
                                                
        System.out.println("");
        System.out.println("Why do you want to be a computer programmer? ");
        System.out.println("");
        String questionTenInput = myCinReader.readString();
        System.out.println("Your answer will be printed out and sent to the judges.  ");
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Congratulations! You are done!!!");
        
    }

}//end mid term trial





