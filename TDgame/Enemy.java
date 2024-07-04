import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Opis klase  Enemy .
 * Ova klasa predstavlja protivnike.
 * @author (Snezana) 
 * @version (2.5  04.07.2024.)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int moveDelay;
    
    public Enemy(int moveDelay)
    {
        this.moveDelay=moveDelay;
    }
    public void act()
    {
        // ova metoda pomera objekat za dva polja u odredjenom pravcu
        this.move(1);
        if (this.isAtEdge())
        {
            this.setRotation(this.getRotation()+180);
        }
        else
        {
        if (this.isTouching(Direction.class))
            {
                Direction direction=(Direction)this.getOneIntersectingObject(Direction.class);
                this.setRotation(direction.getRotation());
            }
            if (this.isTouching(Orb.class))
            {
                this.setRotation(this.getRotation()-90);
            }
        }
        
    }
}
