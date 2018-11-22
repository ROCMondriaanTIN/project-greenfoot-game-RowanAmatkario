import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private int xPositieStar = 30;
    private int xPositieKey = 30;
    private int xPositieDiamand = 1000000;
    private int score = 0;
    
    public void act()
    {
        
    }
    public void updateScoreStar()
    {
        score ++;
        getWorld().addObject(new Star(true), xPositieStar, 50);
        xPositieStar += 40;
    }
    public void updateScoreKey()
    {
        score ++;
        getWorld().addObject(new Key(true), xPositieKey, 110);
        xPositieKey += 40;
    }
    public void updateScoreDiamand()
    {
        score ++;
        getWorld().addObject(new Diamand(true), xPositieKey,50);
        xPositieKey -= 55;
    }
    
}
    
