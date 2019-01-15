


import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private double acc;
    private double drag;
    private int charStatus = 1;
    GreenfootImage[] images = new GreenfootImage[11];
    int imageNumber;
    public static int HudSter = 0;
    public static int level;
    public boolean right = true;
    public boolean mirror = true;
    private int setPlaynumber = 1;
    public int frame;
    public int getal;
    public int springNummer;
    private int walkLinks = -10;
    private int walkRechts = 10;
   
    
  
    
    Scoreboard sb;
    
    
    
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.6;
        setImage("p1_stand.png");
        GreenfootImage myImage = getImage();
        int myNewHeigth = (int) myImage.getHeight()*3/4;
        int myNewWidth = (int)myImage.getWidth()*3/4;
        myImage.scale(myNewWidth, myNewHeigth);
        for( int i=0; i<images.length; i++ ) images[i] = new GreenfootImage( "p1_walk" + (i+1) + ".png" );
        setImage( images[imageNumber] );
    }
    public int charCoin;
    @Override
    public void act() {
        handleInput();
        charSwitch();
        
        
        
        
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
                Greenfoot.playSound("oehsound.wav");
                getWorld().removeObject(this);
                
                return;
            }
        
        }
       
        for (Actor water : getIntersectingObjects(Water.class)){
            if ( water != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new SelectLevel());
                return;
            }
        }
        for (Actor lava : getIntersectingObjects(Lava.class)){
            if ( lava != null) {
                getWorld().removeObject(this);
                return;
            }
        }  
        for (Actor spikes : getIntersectingObjects(Spikes.class)){
            if ( spikes != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new SelectLevel());
                return;
            }
        }
        /*for (Actor ClosedDoorMid : getIntersectingObjects(ClosedDoorMid.class)) {
            if ( ClosedDoorMid != null) {
                Greenfoot.setWorld(new SelectLevel());
                return;
            }
        }*/
            
        Actor Star = getOneIntersectingObject(Star.class); 

        if(Star != null) { 
            getWorld().removeObject(Star); 
            sb.updateScoreStar();
            
            
        } 
   
        Actor Key = getOneIntersectingObject(Key.class); 

        if(Key != null) { 
            getWorld().removeObject(Key); 
            sb.updateScoreKey();
            switch(level){
            case 1:
                Hero.level = 2;
            case 2:
                Hero.level = 3;
            case 3:
                Hero.level = 4;
            case 4:     
        }
        } 
        Actor Diamand = getOneIntersectingObject(Diamand.class); 

        if(Diamand != null) { 
            getWorld().removeObject(Diamand); 
            sb.updateScoreDiamand();
            
        } 
        Actor BlueCoin= getOneIntersectingObject(BlueCoin.class); 

        if(BlueCoin != null) { 
            getWorld().removeObject(BlueCoin); 
            sb.updateScoreBlueCoin();
            
            charCoin ++;
            charStatus = 2;
        } 
        Actor PinkCoin = getOneIntersectingObject(PinkCoin.class);
        if(PinkCoin != null) { 
            getWorld().removeObject(PinkCoin); 
            sb.updateScorePinkCoin();
            getImage().scale(56, 64);
            
            
            charCoin ++;
            charStatus = 3;
        }
        Actor GreenCoin = getOneIntersectingObject(GreenCoin.class);
        if(GreenCoin != null) { 
            getWorld().removeObject(GreenCoin); 
            sb.updateScoreGreenCoin();
            
            charCoin ++;
            charStatus = 1;
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
   
 
public void animateRight()
    {
        if(frame == 1)
        {
        setImage("p_walk01.png");
        }
        else if(frame == 2)
        {
        setImage("p_walk02.png");
        }
       else if(frame == 3)
        {
        setImage("p_walk03.png");
        }
        else if(frame == 4)
        {
        setImage("p_walk04.png");
        }
        else if(frame == 5)
        {
        setImage("p_walk05.png");
        }
        else if(frame == 6)
        {
        setImage("p_walk06.png");
        }
        else if(frame == 7)
        {
        setImage("p_walk07.png");
        }
        else if(frame == 8)
        {
        setImage("p_walk08.png");
        }
        else if(frame == 9)
        {
        setImage("p_walk09.png");
        }
        else if(frame == 10)
        {
         setImage("p_walk10.png");
        }
        if(frame == 11)
        {
         setImage("p_walk11.png");
        
        frame = 1;
        return;
        }
        frame ++;
    }

    
    public void animateLeft()
    {
        if(frame == 1)
        {
        setImage("p_walk01_.png");
        }
        else if(frame == 2)
        {
        setImage("p_walk02_.png");
        }
        else if(frame == 3)
        {
        setImage("p_walk03_.png");
        }
        else if(frame == 4)
        {
        setImage("p_walk04_.png");
        }
        else if(frame == 5)
        {
        setImage("p_walk05_.png");
        }
        else if(frame == 6)
        {
        setImage("p_walk06_.png");
        }
        else if(frame == 7)
        {
        setImage("p_walk07_.png");
        }
        else if(frame == 8)
        {
        setImage("p_walk08_.png");
        }
        else if(frame == 9)
        {
        setImage("p_walk09_.png");
        }
        else if (frame == 10)
        {
        setImage("p_walk10_.png");
        }
        else if (frame == 11)
        {
        setImage("p_walk11_.png" );
        
        frame = 1;
        return;
        }
        frame ++;
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
    
            //if(setPlaynumber == 3) {
                //getImage.scale(56, 64);
           // }
}
}

    int getWidth() {
        return getImage().getWidth() - 5;
    }

    public int getHeight() {
        return getImage().getHeight() - 5;
    }
    public void charSwitch(){
        switch (charStatus) {
            case 1: setImage("p1_stand.png");
                    getImage().scale(81, 87);
                    setPlaynumber = -14;
                    acc = 0.6;
                    drag = 0.6;
                    break;
            case 2: setImage("p2_stand.png");
                    getImage().scale(82, 100);
                    setPlaynumber = -17;
                    acc = 1.0;
                    drag = 0.6;
                    break;
            case 3: setImage("p3_stand.png");
                    getImage().scale(56, 64);
                    setPlaynumber = -11;
                    acc = 0.9;
                    drag = 0.2;
                    break;
    }
    }
   
            
    public void mirrorImage(){
        if (mirror && right){ 
    getImage().mirrorHorizontally();
}
    else if (!mirror && right){
    getImage().mirrorHorizontally();
}
}

}     
    

