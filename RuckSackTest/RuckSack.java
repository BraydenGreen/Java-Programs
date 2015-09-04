class RuckSack{
//fields
  Canteen myCanteen = new Canteen() ;
  public Equipment[] equipment;
  
  //constructors
  public RuckSack(){
    equipment = new Equipment[0];
    myCanteen = null;
  }//end rucksack
  
  //methods
  public void addCanteen(){
    myCanteen = new Canteen();
  }//end addCanteen
  
  public void listEquipment(){
    int i=0;
      while(i < equipment.length){
        System.out.println( equipment[0].name );
        i++;
      }//end while loop
  }//end list equipment
  
  public void removeEquipment(int index){
    equipment = removeIndex( equipment , index);
  }
  
  private Equipment[] removeIndex(Equipment[] original, int index){
      Equipment[] newArray = new Equipment[original.length - 1];
      System.arraycopy(original, 0, newArray, 0, index);
      System.arraycopy(original, index + 1, newArray, index, original.length - index-1);
      return newArray;
  }
  
  public void addEquipment(int index){
    equipment = addIndex ( equipment, index);
  }//end add equipment
  
  private Equipment[] addIndex(Equipment[] original, int index){
      Equipment[] newArray = new Equipment[original.length + 1];
      System.arraycopy(original, 0, newArray, 0, index);
      System.arraycopy(original, index - 1, newArray, index, original.length + index+1);
      return newArray;
  }

}//end class