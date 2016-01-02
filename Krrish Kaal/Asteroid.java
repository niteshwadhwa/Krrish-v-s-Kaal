import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Asteroid extends SmoothMover {
    /** Size of this asteroid */
    private int size;

    /** When the stability reaches 0 the asteroid will explode */
    private int stability;
    
    private Counter counter;

    public static int aSize;
    
    public Asteroid(Counter counter, int size) {
        super(new Vector(Greenfoot.getRandomNumber(360), 2));
        aSize = size;
        setSize(size);
        this.counter = counter;
    }
    
    public void act() {         
        move();
        aSize = size;
    }

    /**
     * Set the size of this asteroid. Note that stability is directly
     * related to size. Smaller asteroids are less stable.
     */
    public void setSize(int size) {
        stability = size;
        this.size = size;
        GreenfootImage image = getImage();
        image.scale(size, size);
    }

    /**
     * Return the current stability of this asteroid. (If it goes down to 
     * zero, it breaks up.)
     */
    public int getStability() {
        return stability;
    }
    
    /**
     * Hit this asteroid dealing the given amount of damage.
     */
    public void hit(int damage) {
        counter.add(damage * GameScreen.level);
        stability = stability - damage;
        if(stability <= 0) 
            breakUp ();         
    }
    
    /**
     * Break up this asteroid. If we are still big enough, this will create two
     * smaller asteroids. If we are small already, just disappear.
     */
    private void breakUp() {
        Greenfoot.playSound("Explosion.wav");
        getWorld().removeObject(this);
        GameScreen.aNumber--;
    }
}