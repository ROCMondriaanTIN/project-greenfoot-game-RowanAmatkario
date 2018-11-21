import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamanten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamanten extends Verzamelobject
{
     private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    
    public Diamanten()
    {
        super();
        setImage("hud_gem_blue.png");
        firstAct = true;
    }
       
    
    /**
     * Act - do whatever the GoudenMunt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        applyVelocity();
        if (getX() >= xMax) {
            x = xMax;
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
        }
        
    }    
}