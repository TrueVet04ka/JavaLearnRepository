
public class Auto
{
    private float speed= 0;
    private int weight= 0;
    private String color= "null";
    private byte[] coordinate = {0, 0, 0};


    public Auto(float speed, int weight, String color, byte[] coordinate)
    {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
        System.out.println(GetValues());
    }
    public Auto (float speed, int weight)
    {
this.speed = speed;
this.weight = weight;
System.out.println(GetValues());
    }
 

    protected String GetValues()
    {
        String info = " Спиид: " + speed +" Вееес: " + weight + " Цвеет "+ color;
        String InfoCoordinates = " Coordinates: ";
        for(int i =0; i<coordinate.length; i++)
            InfoCoordinates = InfoCoordinates + coordinate[i];
        return info + InfoCoordinates;
    }
}


