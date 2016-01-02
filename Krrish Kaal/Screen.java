import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Screen extends World
{

    /**
     * Constructor for objects of class Screen.
     * 
     */
    public Screen()
    {    
        // Create a new world with 800x641 cells with a cell size of 1x1 pixels.
        super(800, 641, 1); 
    }
    protected void setScreen(Screen screen){
        Greenfoot.setWorld(screen);
    }
}
