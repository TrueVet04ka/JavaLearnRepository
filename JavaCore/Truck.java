
public class Truck extends Auto {

    private boolean isLoaded = false;
    Truck(float speed, int weight)
    {
super(speed, weight);
    }
    Truck(float speed, int weight,String color, byte[] coordinate)
    {
super(speed, weight, color, coordinate);

    }

    public void SetValues(float speed, int weight, String color, byte[] coordinate, boolean loadedstat)
    {
        System.out.println("set method");
       super.SetValues(speed, weight, color, coordinate);
       isLoaded = loadedstat;
       System.out.println(GetValues());
        System.out.println(getLoaded());
    }
@Override
    public void SetValues(float speed, int weight, String color, byte[] coordinate)
    {
        super.SetValues(speed, weight, color, coordinate);
  
    }
    public void setLoadedStat(boolean loaded)
    {
this.isLoaded = loaded;
    }
    public String getLoaded()
    {
        if(isLoaded)
       return  "Груз есть";
        else
        return "Груза нет";

    }
}
