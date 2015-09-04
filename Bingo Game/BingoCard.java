import java.util.*;
class BingoCard
{

  //Fields 
  public int[] numbers;

  //Constructors
  public BingoCard()
  {
  }

//Methods
  int[] numberValueB = new int[5];
  int[] numberValueI = new int[5];
  int[] numberValueN = new int[5];
  int[] numberValueG = new int[5];
  int[] numberValueO = new int[5];

  public void BingoCard()
  {
    numberValueB[0] = randomizeNumbers();
    numberValueB[1] = randomizeNumbers();
    numberValueB[2] = randomizeNumbers();
    numberValueB[3] = randomizeNumbers();
    numberValueB[4] = randomizeNumbers();
    
    numberValueI[0] = randomizeNumbers()+15;
    numberValueI[1] = randomizeNumbers()+15;
    numberValueI[2] = randomizeNumbers()+15;
    numberValueI[3] = randomizeNumbers()+15;
    numberValueI[4] = randomizeNumbers()+15;
    
    numberValueN[0] = randomizeNumbers()+30;
    numberValueN[1] = randomizeNumbers()+30;
    numberValueN[2] = randomizeNumbers()+30;
    numberValueN[3] = randomizeNumbers()+30;
    numberValueN[4] = randomizeNumbers()+30;
    
    numberValueG[0] = randomizeNumbers()+45;
    numberValueG[1] = randomizeNumbers()+45;
    numberValueG[2] = randomizeNumbers()+45;
    numberValueG[3] = randomizeNumbers()+45;
    numberValueG[4] = randomizeNumbers()+45;
    
    numberValueO[0] = randomizeNumbers()+60;
    numberValueO[1] = randomizeNumbers()+60;
    numberValueO[2] = randomizeNumbers()+60;
    numberValueO[3] = randomizeNumbers()+60;
    numberValueO[4] = randomizeNumbers()+60;
  }
  
  public int randomizeNumbers()
  {
    Random rand = new Random();
    int randomized = rand.nextInt(15)+1;
      return randomized;
  }// end method randomizeNumbers

  public void printNumbers()
  {
   int[] list = {numberValueB[0],numberValueI[0],numberValueN[0],numberValueG[0],numberValueO[0]};
   int[] list2 = {numberValueB[1],numberValueI[1],numberValueN[1],numberValueG[1],numberValueO[1]};
   int[] list3 = {numberValueB[2],numberValueI[2],numberValueN[2],numberValueG[2],numberValueO[2]};
   int[] list4 = {numberValueB[3],numberValueI[3],numberValueN[3],numberValueG[3],numberValueO[3]};
   int[] list5 = {numberValueB[4],numberValueI[4],numberValueN[4],numberValueG[4],numberValueO[4]};
    for (int x  : list)
    {
       System.out.print(x + " ");
    }
      System.out.println("");
   for (int x2  : list2)
   {
       System.out.print(x2 + " ");
   }
       System.out.println("");
   for (int x3  : list3)
   {
       System.out.print(x3 + " ");
   }
       System.out.println("");
   for (int x4  : list4)
   {
       System.out.print(x4 + " ");
   }
       System.out.println("");
   for (int x5  : list5)
   {
       System.out.print(x5 + " ");
   }

 }// end method printNumbers

}//end class BingoCard