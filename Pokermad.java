
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Pokermad extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    game_over1 game_over1 = new game_over1();

    public Pokermad() {
        super();
        setImage("pokerMad.png");
        getImage().mirrorHorizontally();
        walkRange = 140;
        firstAct = true;
        speed = 1;
    }
   
        
    @Override
    public void act() {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
            return;
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
            return;
        }
        Actor a = this.getOneIntersectingObject (Hero.class);
        if (a != null) {
            this.getWorld().removeObject(a);
            this.getWorld().addObject(game_over1, 500,400);
        
    }
}
}
