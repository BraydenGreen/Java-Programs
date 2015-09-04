class Canteen{

  //fields
  public int maxVolume;
  public int percentFull;
  
  //constructors
  public Canteen(){
    maxVolume = 2;
    percentFull = 0;
  }//end default
  
  public Canteen(int maxVolume, int percentFull){
    this.maxVolume = maxVolume;
    this.percentFull = percentFull;
  }//end userspecified
  
  //methods
  
  public void fill(){
    percentFull = 100;
  }//end fill method
  
  public void empty(){
   percentFull = 0;
  }//end empty method
  
  public void sip(){
    if(percentFull > 0){
    percentFull--;}//end if
  }//end sip method

}//end class Canteen