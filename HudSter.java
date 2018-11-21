import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudSter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudSter extends Mover
{
    public static int hudSter=0;
    /**
     * Act - do whatever the HudSter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {if(hudSter>0){
    setImage("star.png");
    }
        // Add your action code here.
    }    
}
