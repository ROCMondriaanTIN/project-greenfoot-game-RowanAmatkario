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
        getWorld().addObject(new Coin(), xPositie, 150);
        xPositie += 20;
    }
}
    
