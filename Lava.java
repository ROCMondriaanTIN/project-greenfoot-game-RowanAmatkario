import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lava here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lava extends Tile
{
    private int xMin;
    private int xMax;
    private boolean firstAct;
    
    public Lava(String image, int width, int heigth) {
        super(image, width, heigth);
        setImage("liquidLavaTop_mid.png");
        getImage().mirrorHorizontally();        
        firstAct = true;
    }
    /**
     * Act - do whatever the Lava wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
