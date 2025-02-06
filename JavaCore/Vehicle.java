abstract public class Vehicle {
    private int fuel;
    private int speed;

    abstract public void refuel();

    abstract public void start();

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
   public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public int getFuel() {
        return fuel;
    }
    public int getSpeed()
    {
        return speed;
    }
}
