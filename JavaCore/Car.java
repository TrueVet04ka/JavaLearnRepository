public class Car extends Vehicle{
    @Override
    public void start()
    {
        setSpeed(1);
    }
    @Override
    public void refuel()
    {
        setFuel(100);
    }    
    public void show()
    {
        System.out.println(getFuel());
        System.out.println(getSpeed());
    }
}
