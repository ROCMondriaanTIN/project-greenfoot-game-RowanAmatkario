import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private int score = 0;
    
    public Scoreboard()
    {
        GreenfootImage img = new GreenfootImage(100, 30);
        img.drawString("Score :" + score, 5, 25);
        setImage(img);
    }
   
    public void changeScore() 
    {
        score = score + 1;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("Score : " + score, 5, 25); 
    }    
}
