import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Hud
{ public boolean isGepakt;
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Star(boolean isGepakt)
    {
        this.isGepakt = isGepakt;
    }
    public void act() 
    {
        if (isGepakt == false)
        {
        applyVelocity();
    }
    }    
}
