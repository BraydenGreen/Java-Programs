import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snowman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowman extends Actor
{
    /**
     * Act - do whatever the Snowman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action     
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+3);
        }
    }

}
