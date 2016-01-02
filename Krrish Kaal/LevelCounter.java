import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class LevelCounter extends Actor implements IObserver{
    private static final Color textColor = new Color(29, 234, 59);

    public static int level;
    private String text;
    private int stringLength;

    public LevelCounter() {
        this(0);
    }

    public LevelCounter(int level) {
        text = "Level: ";
        stringLength = (text.length() + 2) * 10;
        Font h = new Font("Helvetica", Font.PLAIN, 16);

        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage image = getImage();
        image.setColor(Color.WHITE);
        image.setFont(h);
        this.level = level;
        updateImage();
    }
    
    public void update() {
        level = GameScreen.level;
        updateImage();
    }

    /**
     * Make the image
     */
    private void updateImage() {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + level, 1, 12);
    }

}
