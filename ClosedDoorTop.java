import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClosedDoorTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClosedDoorTop extends Hud
{
    public ClosedDoorTop() {
        setImage ("door_closedTop.png");
    }
    public ClosedDoorTop (int i) {
        setImage ("door_closedTop.png" );
    }
    
    public void act() 
    {
        applyVelocity();
        for (Hero hero : getIntersectingObjects (Hero.class)) {
            if ( hero != null ) {
                setImage ("door_openTop.png");
                if (Greenfoot.isKeyDown("right")) {
                    Greenfoot.setWorld(new SelectLevel());
        
    }       
}
}
}
}


