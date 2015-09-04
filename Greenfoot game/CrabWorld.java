import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab, 113, 294);
        Crab crab2 = new Crab();
        addObject(crab2, 414, 378);
        Worm worm = new Worm();
        addObject(worm, 374, 180);
        Worm worm2 = new Worm();
        addObject(worm2, 470, 99);
        Worm worm3 = new Worm();
        addObject(worm3, 198, 76);
        Worm worm4 = new Worm();
        addObject(worm4, 190, 182);
        Worm worm5 = new Worm();
        addObject(worm5, 293, 127);
        Worm worm6 = new Worm();
        addObject(worm6, 272, 308);
        Worm worm7 = new Worm();
        addObject(worm7, 66, 133);
        Worm worm8 = new Worm();
        addObject(worm8, 78, 45);
        Worm worm9 = new Worm();
        addObject(worm9, 88, 453);
        Worm worm10 = new Worm();
        addObject(worm10, 223, 465);
        Worm worm11 = new Worm();
        addObject(worm11, 221, 371);
        Worm worm12 = new Worm();
        addObject(worm12, 379, 431);
        Worm worm13 = new Worm();
        addObject(worm13, 423, 527);
        Worm worm14 = new Worm();
        addObject(worm14, 468, 266);
        Worm worm15 = new Worm();
        addObject(worm15, 324, 493);
        Worm worm16 = new Worm();
        addObject(worm16, 423, 379);
        removeObject(crab2);
        crab.setLocation(257, 250);
        Lobster lobster = new Lobster();
        addObject(lobster, 125, 99);
        Lobster lobster2 = new Lobster();
        addObject(lobster2, 480, 426);
        removeObject(lobster2);
    }
}
