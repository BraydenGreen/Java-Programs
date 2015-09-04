import java.util.Date;
import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class paintDungeon extends JApplet
{
        
        
     public void init()
      {
          
      }
   
         
    public void run()
    {
      
   
    }//end init
    
    
    public void paint(Graphics g)
    {
     
    g.setColor(Color.GREEN);
    g.drawString( "Welcome to the Dungeon", 200, 70);
 
    Image iStairs = getImage(getDocumentBase(),"tiles\\DT1\\4x2_Stairs.a.0.jpg");
    g.drawImage(iStairs, 200,296, this);

    Image iCrypt = getImage(getDocumentBase(),"tiles\\DT3\\8x10_Mausoleum.b.180.jpg");
    g.drawImage(iCrypt, 328, 168, this);

    Image iCrypt2 = getImage(getDocumentBase(),"tiles\\DT3\\8x10_Mausoleum.b.180.jpg");
    g.drawImage(iCrypt2, 583, 168, this);
      setBackground(Color.black);
       
    }//End paint



}//end class