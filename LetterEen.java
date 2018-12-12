import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetterEen extends Actor
{
    /**
     * Act - do whatever the Letter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
            for (ClosedDoorMid hero : getIntersectingObjects(ClosedDoorMid.class)){
            if (hero != null) {
                getWorld().removeObject(this);
                setImage("hud_2.png");
                
    } 
}
    }    
    private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
}
}
