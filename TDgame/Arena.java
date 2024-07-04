import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void respawn(Enemy e)
    {
        e=new Enemy(5,3);
        e.setLocation(0, 5);
        e.setRotation(0);
        this.addObject(e,0,5);
    }
    public Arena()
    {    
        // Create a new world with 24x12 cells with a cell size of 50x50 pixels.
        super(24, 12, 50); 
        Enemy enemy1 = new Enemy(5,3);
        enemy1.setRotation(0);
        this.addObject(enemy1,0,5);
        Direction dir1= new Direction();
  
        this.addObject(dir1,10,5);
        Orb orb1= new Orb(5);
        orb1.setRotation(0);
        this.addObject(orb1,10,10);
        
        
    }
}
