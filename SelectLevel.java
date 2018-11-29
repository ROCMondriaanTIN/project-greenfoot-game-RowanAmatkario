import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevel extends World
{

    /**
     * Constructor for objects of class SelectLevel.
     * 
     */
    public SelectLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        
        prepare();
    }
    private void prepare()
    {
        TitleLetterLevel titleletterlevel = new TitleLetterLevel();
        addObject(titleletterlevel, 716, 357);
      
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new MyWorld());
    }
    public void click() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
