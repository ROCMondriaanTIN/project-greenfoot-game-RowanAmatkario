

import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    GreenfootImage[] images = new GreenfootImage[11];
    int imageNumber;
    public static int HudSter = 0;
    Scoreboard sb;
    
    
    
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.6;
        setImage("p3_stand.png");
        GreenfootImage myImage = getImage();
        int myNewHeigth = (int) myImage.getHeight()*3/4;
        int myNewWidth = (int)myImage.getWidth()*3/4;
        myImage.scale(myNewWidth, myNewHeigth);
        for( int i=0; i<images.length; i++ ) images[i] = new GreenfootImage( "p3_walk" + (i+1) + ".png" );
        setImage( images[imageNumber] );
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        if (sb == null){
            sb = new Scoreboard();
            getWorld().addObject(sb, -10, -10);
        }
        
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        
        }
        for (Actor water : getIntersectingObjects(Water.class)){
            if ( water != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new MyWorld());
                return;
            }
        }
        for (Actor lava : getIntersectingObjects(Lava.class)){
            if ( lava != null) {
                getWorld().removeObject(this);
                return;
            }
        }  
        Actor Star = getOneIntersectingObject(Star.class); 

        if(Star != null) { 
            getWorld().removeObject(Star); 
            sb.updateScoreStar();
            MyWorld world = (MyWorld)getWorld(); 
        } 
   
        Actor Key = getOneIntersectingObject(Key.class); 

        if(Key != null) { 
            getWorld().removeObject(Key); 
            sb.updateScoreKey();
            MyWorld world = (MyWorld)getWorld(); 
        } 
        Actor Diamand = getOneIntersectingObject(Diamand.class); 

        if(Diamand != null) { 
            getWorld().removeObject(Diamand); 
            sb.updateScoreDiamand();
            MyWorld world = (MyWorld)getWorld(); 
        } 
    }
    public void animation()
    {
        imageNumber = ( imageNumber + 1 ) % images.length;
        setImage( images[imageNumber] );
    }  
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return under != null;
    }
        
    public void handleInput() {
        if ((Greenfoot.isKeyDown("up"))&&(onGround()== true)) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("left")) {
            if (onGround() == true) {
                animation();
            }
            velocityX = -10;
        } else if (Greenfoot.isKeyDown("right")) {
            if (onGround() == true) {
                animation();
            }
            velocityX = 10;
    }
}

    public int getWidth() {
        return getImage().getWidth() - 40;
    }

    public int getHeight() {
        return getImage().getHeight() - 40;
    }
    
}
