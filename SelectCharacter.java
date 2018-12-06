import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectCharacter extends World
{

    /**
     * Constructor for objects of class SelectCharacter.
     * 
     */
    
    public SelectCharacter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1,false); 
        Greenfoot.start();
  
        prepare();
        
    }
    private void prepare()
    {
        TitleLetterLevel titleletterlevel = new TitleLetterLevel();
        addObject(titleletterlevel, 716, 357);
        LetterEen lettereen = new LetterEen();
        LetterTwee lettertwee = new LetterTwee();
        LetterDrie letterdrie = new LetterDrie();
        LetterVier lettervier = new LetterVier();
        addObject(lettereen, 169,321);
        addObject(lettertwee, 388,321);
        addObject(letterdrie, 598, 321);
        addObject(lettervier, 825, 321);
        
        
        
      
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
