import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClosedDoorMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClosedDoorMid extends Hud
{
    /**
     * Act - do whatever the ClosedDoorMid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
         applyVelocity();
         openDoor();
    }   
    public void openDoor()
    {
        if(getWorld().getObjects(Key.class).size()==1){
            setImage("door_openMid.png");
}
}
}
