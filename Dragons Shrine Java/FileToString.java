import java.util.*;
import java.io.*;

class FileToString{
 private void stringToFile(String content, String fileName) { 
        try { 
            File file = new File(fileName); 
  
            // if file doesnt exists, then create it 
            if (!file.exists()) { 
                file.createNewFile(); 
            } 
  
            FileWriter fw = new FileWriter(file.getAbsoluteFile()); 
            BufferedWriter bw = new BufferedWriter(fw); 
            bw.write(content); 
            bw.close(); 
  
            //System.out.println("Done writing to " + fileName);//For testing
  
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    }//End Method write

public String file2String(String filename) 
{ 
     
    try{ 
        FileReader fileReader = new FileReader(filename); 
        String fileContents = ""; 
        int i ; 
  
        while((i =  fileReader.read())!=-1){ 
            char ch = (char)i; 
  
            fileContents = fileContents + ch;  
        }//end while 
  
        System.out.println(fileContents); 
        return fileContents; 
    }catch(Exception e){ 
    return "Error " + e; 
    } 

}//end file2String

}