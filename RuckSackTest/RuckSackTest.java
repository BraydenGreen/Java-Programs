class RuckSackTest{

public static void main(String[] args){

  RuckSack myRuckSack = new RuckSack();
  Canteen yourCanteen = new Canteen(2,100);
  Equipment chalk = new Equipment("chalk",1);
  Equipment pick = new Equipment("pick", 5);
  Equipment rope = new Equipment("rope", 10);
  
  Equipment[] groupEquipment = new Equipment[3];
  groupEquipment[0] = chalk;
  groupEquipment[1] = pick;
  groupEquipment[2] = rope;
  
  myRuckSack.addCanteen();
  myRuckSack.addEquipment(0);
  myRuckSack.listEquipment();

  }//end main





}//end class