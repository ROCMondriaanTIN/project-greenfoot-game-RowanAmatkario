import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClosedDoorMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClosedDoorMid extends Hud
{
    public ClosedDoorMid() {
        setImage ("door_closedMid.png");
    }
    public ClosedDoorMid(int i) {
        setImage ( "door_openMid.png");
    }
    
    public void act() 
    {
         applyVelocity();
         for (Hero hero : getIntersectingObjects (Hero.class)) {
             if ( hero != null ) {
                 setImage ("door_openMid.png");
                 if (Greenfoot.isKeyDown("right")){
                     Greenfoot.setWorld (new SelectLevel());
         
    }   
   
}
}
}
}
