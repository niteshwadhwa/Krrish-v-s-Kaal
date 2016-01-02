import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class ModesScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ModesScreen extends Screen
{

    /**
     * Constructor for objects of class ModesScreen.
     * 
     */
    public ModesScreen()
    {
        GreenfootImage img = getBackground();
        
    }
    
    public void act(){
        IModeChain NM = new NormalMode();
        IModeChain EM = new EasyMode();
        IModeChain HM = new HardMode();
        IModeChain NS = new HardMode();
        
        EM.setNextInChainMode(NM);
        NM.setNextInChainMode(HM);
        //System.out.println(Greenfoot.getKey());
        EM.setModeScreen();

    }
}
