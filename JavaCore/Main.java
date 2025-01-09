package JavaCore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Auto Car = new Auto();
        Car.SetValues(150, 2000, "White", new byte[]{0, 5, 4});  
        System.out.println(Car.GetValues());
 

        String a = "myaaaa ";
        int b = 5;
        a += b;
        System.out.println(a);
   }
}



