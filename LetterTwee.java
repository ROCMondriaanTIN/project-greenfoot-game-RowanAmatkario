import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LetterTwee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetterTwee extends Actor
{
    /**
     * Act - do whatever the LetterTwee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LetterTwee(){
        if(Hero.level > 1)setImage("hud_2.png");
        else setImage("lock_blue.png");
    }
    public void act() 
    {
        click();
    }    
    private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelTwee());
        }
}
}

