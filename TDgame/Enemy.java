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
    private int nextMoveCounter;
    private int attack;
    
    public Enemy(int moveDelay,int attack)
    {
        this.moveDelay=moveDelay;
        this.nextMoveCounter=0;
        this.attack=attack;
    }
    public int getAttack()
    {
        return attack;
    }
    public void act()
    {
        // ova metoda pomera objekat za dva polja u odredjenom pravcu
        this.nextMoveCounter++;
        if (this.nextMoveCounter==this.moveDelay)
        {
        this.move(1);
        this.nextMoveCounter=0;
    }
        if (this.isTouching(Orb.class))
        {
            Arena arena =(Arena)this.getWorld();
            Orb orb=(Orb)arena.getObjectsAt(this.getX(), this.getY(), Orb.class);
            orb.hit(this);
        }
        
        if (this.isTouching(Direction.class))
            {
                Direction direction=(Direction)this.getOneIntersectingObject(Direction.class);
                this.setRotation(direction.getRotation());
            }
           
        
        
    }
}
