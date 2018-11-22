import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Tile
{
    game_over1 game_over1 = new game_over1();
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private static int id;
    
    public Water(String image, int width, int heigth) {
        super(image, width, heigth);
        setImage(image);
        getImage().scale(width, heigth);
        if (CollisionEngine.DEBUG) {
            getImage().drawString("ÏD: " + id, 10, 10);
        }
        _id = id;
        id++;
    }
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor a = this.getOneIntersectingObject (Hero.class);
        if (a != null) {
            this.getWorld().removeObject(a);
            this.getWorld().addObject(game_over1, 500,400);
        
    }
    }    
}
