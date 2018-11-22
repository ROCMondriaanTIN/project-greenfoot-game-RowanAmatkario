import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private int xPositie = 30;
    private int score = 0;
    
    public void act()
    {
        
    }
    public void updateScoreStar()
    {
        score ++;
        getWorld().addObject(new Star(true), xPositie, 50);
        xPositie += 40;
    }
    public void updateScoreKey()
    {
        score ++;
        getWorld().addObject(new Key(true), xPositie, 100);
        xPositie += 40;
    }
}
    
