
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Verzamelobject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Verzamelobject extends Mover
{
    public int screenX;
    public int screenY;
    public double velocityX;
    public double velocityY;

    private int worldX;
    private int worldY;
    private boolean firstLocation = true;
    
    /**
     * Act - do whatever the Verzamelobject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void applyVelocity() {
        if (Math.abs(velocityX) < 0.01) {
            velocityX = 0;
        }
        if (Math.abs(velocityY) < 0.01) {
            velocityY = 0;
        }
        setLocation((int) (getX() + .5 + velocityX), (int) (getY() + .5 + velocityY));
    } 
    public void setLocation(int x, int y) {
        if (firstLocation == true) {
            firstLocation = false;
            screenX = x;
            screenY = y;
        }
        super.setLocation(screenX, screenY);
        this.worldX = x;
        this.worldY = y;
    }
    public int getX() {
        return this.worldX;
    }
    public int getY() {
        return this.worldY;
    }
    public int getScreenX() {
        return this.screenX;
    }
    public int getScreenY() {
        return this.screenY;
    }
    public String toString() {
        return "X: " + getX() + "\n"
                + "Y: " + getY() + "\n"
                + "screenX: " + getScreenX() + "\n"
                + "screenY: " + getScreenY() + "\n"
                + "velocityX: " + velocityX + "\n"
                + "velocityY: " + velocityY + "\n";
    }
        
    
}
