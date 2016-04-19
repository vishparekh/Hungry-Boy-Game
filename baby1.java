import greenfoot.*;
import java.awt.Color;


/**
 * Write a description of class baby1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby1 extends Actor
{
    /**
     * Act - do whatever the baby1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         if(Greenfoot.isKeyDown("w"))
        {
        setLocation(getX(),getY()-5);
    }
        if(Greenfoot.isKeyDown("s"))
        {
        setLocation(getX(),getY()+5);
    }
        if(Greenfoot.isKeyDown("d"))
        {
        setLocation(getX()+5,getY());
    }
        if(Greenfoot.isKeyDown("a"))
        {
        setLocation(getX()-5,getY());
    }
    
    
 Actor actor=getOneIntersectingObject(Car.class);
        if(actor != null)
        {
     ((Road)getWorld()).count.add(1);    

        getWorld().removeObject(actor);
    }
      
    if(Road.count.getValue()==1)
    {
        GreenfootImage g=new GreenfootImage("You Lost",40,Color.WHITE,Color.BLUE);
        setImage(g);
    Greenfoot.stop();
    
    
}    
 Actor actor1=getOneIntersectingObject(Ambulance.class);
        if(actor1 != null)
        {
     ((Road)getWorld()).count.add(1);    

        getWorld().removeObject(actor);
    }
      
    if(Road.count.getValue()==1)
    {
        GreenfootImage g=new GreenfootImage("You Lost",40,Color.WHITE,Color.BLUE);
        setImage(g);
    Greenfoot.stop();
    
    
}    
 Actor actor2=getOneIntersectingObject(Auto.class);
        if(actor2 != null)
        {
     ((Road)getWorld()).count.add(1);    

        getWorld().removeObject(actor);
    }
      
    if(Road.count.getValue()==1)
    {
        GreenfootImage g=new GreenfootImage("You Lost",40,Color.WHITE,Color.BLUE);
        setImage(g);
    Greenfoot.stop();
    
    
}    
   Actor actor3=getOneIntersectingObject(Bus.class);
        if(actor3 != null)
        {
     ((Road)getWorld()).count.add(1);    

        getWorld().removeObject(actor);
    }
      
    if(Road.count.getValue()==1)
    {
        GreenfootImage g=new GreenfootImage("You Lost",40,Color.WHITE,Color.BLUE);
        setImage(g);
    Greenfoot.stop();
    
    
}    

        Actor actor4=getOneIntersectingObject(Pizza.class);
        if(actor4 != null)
        {
             getWorld().removeObject(actor);
           GreenfootImage g=new GreenfootImage("You Win",40,Color.WHITE,Color.BLUE);
           setLocation(300,300);
           setRotation(0);
          setImage(g);
           Greenfoot.stop(); 
        }
    
         


    }    
}
