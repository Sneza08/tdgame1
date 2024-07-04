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
    public void act()
    {
        // ova metoda pomera objekat za dva polja u odredjenom pravcu
        this.move(2);
        
        if (this.isTouching(Direction.class))
            {
                this.setRotation(this.getRotation()+90);
            }
            if (this.isTouching(Orb.class))
            {
                this.setRotation(this.getRotation()-90);
            }
        
        
    }
}
