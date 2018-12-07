import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UnlockObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnlockObject extends Actor
{
    private int level;
    private int player;
    private boolean spelen;
    
    public UnlockObject(int level, int player, boolean spelen){
        if(spelen){
            setImage("hud_2.png");
        }
        else {
            setImage("lock_blue.png");
        }
        this.level = level;
        this.spelen = spelen;
        this.player = player;
    }
    
    /**
     * Act - do whatever the UnlockObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }
  
}

