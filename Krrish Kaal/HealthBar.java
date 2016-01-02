import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Health Bar Implementation
 * 
 * @author Sumit Rana 
 * @version 1.0
 */
public class HealthBar extends Actor implements IObserver
{
    int health = 4;
    int healthBarWidth = 80;
    int healthBarHeight = 15;
    int pixelPerHealthPoint = (int)healthBarWidth/health;
    
    public HealthBar()
    {
        update();
    }
    public void act() 
    {
        update();
    }    
    public void update()
    {
        setImage (new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth +1, healthBarHeight +1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, health*pixelPerHealthPoint, healthBarHeight);
    }
    public void loseHealth()
    {
        health--;
    }
    public void increaseHealth(){
        health++;
    }
}
