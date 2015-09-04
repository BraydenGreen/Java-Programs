class testDie {

  public static void main(String[] args){
  // i six sided, 1 eight sided, 1 4 sided
     Die[] myDieArr = new Die[3];
     myDieArr[0] = new Die(4);
     myDieArr[1] = new Die(6);
     myDieArr[2] = new Die(8); 
     
     myDieArr[0].roll();
     myDieArr[1].roll();
     myDieArr[2].roll();
     
     int i = 0;
     while ( i < myDieArr.length){
     myDieArr[i].roll();
     System.out.println( myDieArr[i].sideUp );
     i++;


    }

  }

}