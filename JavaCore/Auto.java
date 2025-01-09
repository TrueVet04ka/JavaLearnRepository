package JavaCore;


public class Auto
{
    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;

    public void SetValues(float _speed, int _weight, String _color, byte[] _coordinate)
    {
speed = _speed;
weight = _weight;
color = _color;
coordinate = _coordinate;

    }

    public String GetValues()
    {
        String info = " Спиид: " + speed +" Вееес: " + weight + " Цвеет "+ color;
        String InfoCoordinates = " Coordinates: ";
        for(int i =0; i<coordinate.length; i++)
            InfoCoordinates = InfoCoordinates + coordinate[i];
        return info + InfoCoordinates;
    }
}


