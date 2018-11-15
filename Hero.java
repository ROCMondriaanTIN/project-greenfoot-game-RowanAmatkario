
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p3_front.png");
        GreenfootImage myImage = getImage();
        int myNewHeigth = (int) myImage.getHeight()*3/4;
        int myNewWidth = (int)myImage.getWidth()*3/4;
        myImage.scale(myNewWidth, myNewHeigth);
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
       
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        
        }
        
        
    }
   
        
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return under != null;
    }
        
    public void handleInput() {
        if ((Greenfoot.isKeyDown("up"))&&(onGround()== true)) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -4;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 4;
        }
    }

    public int getWidth() {
        return getImage().getWidth() - 40;
    }

    public int getHeight() {
        return getImage().getHeight() - 40;
    }
}
