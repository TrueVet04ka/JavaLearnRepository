

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Car car = new Car(150, 2000, "White", new byte[]{0, 5, 4});
        Truck car2 = new Truck(150, 2000);
        car2.setLoadedStat(true);
        car2.getLoaded();
        car.GetValues();
        String a = "myaaaa ";
        int b = 5;
        a += b;
        System.out.println(a);
   }
}



