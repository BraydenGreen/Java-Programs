class CinReaderTest{

  public static void main(String[] args){
  //Make a reader
  CinReader myReader = new CinReader();
  
  //Ask the user for a string
  System.out.println("Type in a string:");
  //Echo back the string
  String theString = myReader.readString(false);
  System.out.println("You typed " + theString);
  //Ask the user for an int
  System.out.println("Please enter a number between 1 and 25:");
  //echo back the int
  
  int theInt = myReader.readInt(1,25);
  System.out.println("You typed " + theInt);

  }//end main

}// end class c in reader
