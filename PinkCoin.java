import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PinkCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkCoin extends Hud
{
    public boolean isGepakt;
    /**
     * Act - do whatever the PinkCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PinkCoin(boolean isGepakt)
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
