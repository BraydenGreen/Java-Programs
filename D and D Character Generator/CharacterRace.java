import java.util.*;

/**
 * Enumeration class characterRace - write a description of the enum class here
 * 
 * @BraydenGreen
 * @version
 */
public enum CharacterRace
{
    
    // STR, DEX, CON, INT, WIS, CHA
    DWARF (0,0,2,0,2,-2),
    ELF (0,2,-2,2,0,0),
    HALFLING (-2,2,0,0,0,2),
    GNOME (-2,0,2,0,0,2),
    HALFORC (2,0,0,0,0,0),
    HALFELF (0,2,0,0,0,0),
    HUMAN (0,0,2,0,0,0);
    
   public final int Str;
   public final int Dex;
   public final int Con;
   public final int Int;
   public final int Wis;
   public final int Cha;
    
    CharacterRace(int Str, int Dex, int Con, int Int, int Wis, int Cha)
    {
        this.Str=Str;
        this.Dex=Dex;
        this.Con=Con;
        this.Int=Int;
        this.Wis=Wis;
        this.Cha=Cha;
    }
    
}
    
    
    
