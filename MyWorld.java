import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld extends World {

    private CollisionEngine ce;
    private Scoreboard sb;
    game_over1 game_over1 = new game_over1();
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        this.setBackground("background.png");
        Hero.level = 1;
        int[][] map = {
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,8,69,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,66,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,12,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,7,8,8,8,8,8,9,72,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,2,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,64,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,67,8,69,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,2,2,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,71,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,2,-1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,8,8,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,72,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,67,6,6,6,70,69,64,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,72,-1,-1,-1,-1,72,-1,-1,-1},
{-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,7,7,7,7,7,-1,-1,-1,-1,-1,-1,67,8,8,8,68,6,6,6,6,70,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,72,-1,-1,-1},
{-1,-1,8,8,8,8,-1,-1,-1,-1,-1,-1,-1,-1,-1,2,-1,-1,-1,-1,-1,-1,38,-1,38,-1,-1,-1,-1,-1,67,68,6,6,6,6,6,6,6,6,6,6,69,-1,-1,5,5,-1,-1,5,5,-1,-1,5,5,5,5,5,5,5,72,-1,-1,-1},
{-1,-1,6,6,6,6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,38,-1,-1,-1,-1,67,68,6,6,6,6,6,6,6,6,6,6,6,70,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1},
{-1,-1,6,6,6,6,8,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,38,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1},
{-1,-1,6,6,6,6,6,8,-1,-1,-1,14,-1,-1,7,8,9,-1,-1,-1,-1,-1,38,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1},
{-1,-1,6,6,6,6,6,6,8,8,8,8,9,-1,-1,-1,-1,-1,73,64,-1,-1,38,-1,38,-1,-1,-1,64,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,64,-1,-1,-1,-1,64,-1,-1,-1},
{-1,-1,6,6,6,6,6,6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,8,9,-1,-1,-1,-1,-1,-1,7,8,8,8,8,8,8,38,67,8,69,38,8,8,8,8,-1,5,5,5,5,-1,67,8,69,-1,-1,67,8,69,-1,-1,67,8,69,-1,-1},
{-1,-1,6,6,6,6,6,6,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,6,6,6,6,6,6,6,38,6,6,6,38,6,6,6,6,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11},
{-1,-1,6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
{-1,-1,6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},


            };

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 254, 870);
        addObject(new Enemy(), 637, 1130);
        addObject(new Pokermad(), 1871, 1155);
        addObject(new BlueCoin(false), 1357, 135);
        addObject(new PinkCoin(false), 1231, 675);
        addObject(new GreenCoin(false), 2763, 855);
        addObject(new Key(false), 1180, 1153);
        addObject(new ClosedDoorMid(),3205, 390);
        addObject(new ClosedDoorTop(), 3205, 340);
        addObject(new Diamand(false), 2191, 1155);
        addObject(new Star(false), 929, 855);
        addObject(new Star(false), 1745, 1155);
        addObject(new Star(false), 2259, 435);
        addObject(new KeyDisabled(), 1180, 1153);
        setPaintOrder(Hero.class);
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);

        prepare();
    }

    @Override
    public void act() {
        ce.update();
    }

    public game_over1 getGameOver1()
    {
        return game_over1;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Diamand diamand = new Diamand(false);
        addObject(diamand,945,46);
    }
}
