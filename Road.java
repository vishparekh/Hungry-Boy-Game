import greenfoot.*;

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends World
{
    static Counter count;
    /**
     * Constructor for objects of class Road.
     * 
     */
    public Road()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Boy boy = new Boy();
        addObject(boy, 30, 47);
        Car car = new Car();
        addObject(car, 39, 130);
        Auto auto = new Auto();
        addObject(auto, 40, 226);
        auto.setLocation(167, 221);
        auto.setLocation(179, 218);
        Ambulance ambulance = new Ambulance();
        addObject(ambulance, 400, 400);
        Bus bus = new Bus();
        addObject(bus, 100, 200);
        bus.setLocation(5, 300);
        car.setLocation(190,260);
        auto.setLocation(178, 222);
        boy.setLocation(25, 26);
        ambulance.setLocation(400, 400);
        Pizza pizza = new Pizza();
        addObject(pizza, 300, 268);
        baby1 baby = new baby1();
        addObject(baby, 30 , 30);
        baby.setLocation(30 , 30);

        boy.setLocation(30, 30);
        
        
        
         count = new Counter();
        addObject(count,550,50);
    }
}
