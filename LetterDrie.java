import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetterDrie extends Actor
{
    /**
     * Act - do whatever the Letter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
        if(Hero.level > 2)setImage("hud_3.png");
        setImage("lock_red.png");
    }
    private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelDrie());
        }
}
}
