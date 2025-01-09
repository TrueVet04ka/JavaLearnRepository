
public class Truck extends Auto {

    private boolean isLoaded = false;
    Truck(float speed, int weight)
    {
super(speed, weight);
    }
    Truck(float speed, int weight, boolean load)
    {
super(speed, weight);
isLoaded = load;
    }
    public void setLoadedStat(boolean loaded)
    {
this.isLoaded = loaded;
    }
    public void getLoaded()
    {
        if(isLoaded)
        System.out.println("Груз есть");
        else
        System.out.println("Груза нет");

    }
}
