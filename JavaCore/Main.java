
public class Main {

    public static void main(String[] args)
    {
        //Car car = new Car(150, 2000, "White", new byte[]{0, 5, 4});

        Truck car2 = new Truck(150, 2000,  "White", new byte[]{0, 5, 4});
       car2.SetValues(500, 5000, "Blue", new byte[]{0, 6, 8}, true);
        car2.SetValues(0, 0, null, null);
   

   }
}



