import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Hud
{
    private int score = 0;
    int xPositie = 25;
    
    
    public Scoreboard()
    {
        GreenfootImage img = new GreenfootImage(100, 30);
        img.drawString("     :     " + score, 5, xPositie);
        setImage(img);
    }
   
    public void changeScore() 
    {
        score = score + 1;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("  :        " + score, 5, xPositie); 
    }    
    public void updateScore()
    {
        getWorld().addObject(new Coin(), xPositie, 100);
        xPositie += 50;
        
}
}
