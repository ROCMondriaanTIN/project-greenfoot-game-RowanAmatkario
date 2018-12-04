import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spikes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spikes extends Tile
{
    private int xMin;
    private int xMax;
    private boolean firstAct;
    
    public Spikes(String image, int width, int heigth) {
        super(image, width, heigth);
        setImage("spikes.png");
        getImage().mirrorHorizontally();        
        firstAct = true;
    }
    /**
     * Act - do whatever the Spikes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
