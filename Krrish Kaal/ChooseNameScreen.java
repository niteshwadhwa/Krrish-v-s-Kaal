import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class ModeAndNameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChooseNameScreen extends Screen
{
    public static String userName;
    /**
     * Constructor for objects of class ModeAndNameScreen.
     * 
     */
    public ChooseNameScreen()
    {
       GreenfootImage img = getBackground();
        
    }
    
    public void act(){
        
       if(Greenfoot.isKeyDown("a")) {
           userName = "Jag";
           setScreen(new ModesScreen());
           }
       if(Greenfoot.isKeyDown("b")) {
           userName = "Jas";
           setScreen(new ModesScreen());
         }
       if(Greenfoot.isKeyDown("c")) {
           userName = "Nia";
           setScreen(new ModesScreen());
          }
       
       if(Greenfoot.isKeyDown("x")) setScreen(new HomeScreen());
           
       
       
           
    }  
    
}
