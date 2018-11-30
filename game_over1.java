import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game_over1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game_over1 extends Actor
{
    public game_over1()
    {
        setImage("oie_transparent.png");
    }
    /**
     * Act - do whatever the game_over1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    if (Greenfoot.isKeyDown("space"))
    {
        this.getWorld().removeObject(this);
        Greenfoot.setWorld(new SelectLevel());
        
    }    
}
}

