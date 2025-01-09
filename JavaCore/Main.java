package JavaCore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int z = scan.nextInt();
      int[] arr = new int[z];
      for(int i = 0; i < arr.length; i++)
      {
         System.out.println("Число в массив: " );
         int b = scan.nextInt();
         arr[i] = b;
         
      }
      
System.out.println(func(arr));

   }
   public static int func(int[] arr)
   {
      int res = 0;
      System.out.println("Array sum:");
   for(int i = 0; i<arr.length; i++)
   {
       res += arr[i];
   }

   return res;
   }
}




