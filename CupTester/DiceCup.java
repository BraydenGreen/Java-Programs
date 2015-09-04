class DiceCup{

  //fields 
  public Die[] dice;
  
  
  //constructos
  public DiceCup(){
     dice = new Die[0];
  }
  
  //methods
  
  public void shakeDiceCup(){
    int i = 0;
     while( i < dice.length){
     
     dice[i].roll();
     i++;
     }
  }//end shakeDiceCup method 
  
  public Die[] rollOutDice(){
   
    Die[] returnDie = dice;
    dice = new Die[0];
  
    return returnDie;
  }

}//end class DiceCup