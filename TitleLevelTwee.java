import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleLevelTwee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleLevelTwee extends Actor
{
    /**
     * Act - do whatever the TitleLevelTwee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        click();
    }
    public void click() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
