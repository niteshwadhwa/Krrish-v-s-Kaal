import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Screen
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {
        GreenfootImage img = getBackground();
        img.setColor(Color.red);
        img.setFont(new Font("Comic Sans MS Bold", Font.PLAIN, 15));
        img.drawString("Control Instructions", 350,100);
        img.drawString("Spacebar             - Fire",300,150);
        img.drawString("Left Arrow Key <     - Move to left",300,200);
        img.drawString("Right Arrow Key >    - Move to Right",300, 250);
        img.drawString("Up Arrow Key ^       - Lean Forward",300, 300);
        img.drawString("Down Arrow Key       - Lean Backward",300,350);
        img.drawString("Press 'b' to go back",300,600);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("b")){
            setScreen(new HomeScreen());
        }
    }
}
