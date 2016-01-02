import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class HomeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeScreen extends Screen
{

    /**
     * Constructor for objects of class HomeScreen.
     * 
     */
    public HomeScreen()
    {
        GreenfootImage img = getBackground();
        
        
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("i")){
            setScreen(new Instructions());
        }
        if(Greenfoot.isKeyDown("s")){
            setScreen(new ChooseNameScreen());
        }
    }
}