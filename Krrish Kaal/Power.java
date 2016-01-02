/**
 * Write a description of class Powers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Power extends SmoothMover 
 {
     public Power(Vector speed, int rotation)
    {   super(speed);
        setRotation(rotation);
    }
    public abstract void  damage();
 }
