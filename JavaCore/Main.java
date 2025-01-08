package JavaCore;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
//Многомерные массивы
Scanner scanner = new Scanner(System.in) ;
System.out.print("Скок больших масиков?: ");
int value = scanner.nextInt();
System.out.print("Скок мини масиков?: ");
int value2 = scanner.nextInt();
String[][] arr = new String[value][value2];

System.out.println("Заполняем масики");
for(int i = 0;i < arr.length; i++)
{
for(int j = 0;j < arr[i].length; j++)
{

    System.out.print("Введи слово: ");
   arr[i][j] = scanner.next();
}
}
System.out.println("Предложение: ");
for(int i = 0;i < arr.length; i++)
{
for(int j = 0;j < arr[i].length; j++)
{

    System.out.print(" " +arr[i][j]);
  
}
}

      //Одномерные массивы
      /*
      Scanner scanner = new Scanner(System.in) ;
      System.out.print("Из скольки чисел будет ваш массив?: ");
      int value = scanner.nextInt();
      int[] arr = new int[value];

      for(int i = 0; i<arr.length; i++)
      {
      System.out.print("Введите цифру: ");
      arr[i] = scanner.nextInt();
      }
      System.out.println("Ваши цифры: ");
      for(int i = 0; i<arr.length; i++)
      {
         System.out.print(arr[i] + " ");
      }
      int min = arr[0];
      for(int i = 0; i<arr.length; i++)
      {
         if (arr[i] < min) {
            min = arr[i];
         }

      }
System.out.println("Наименьшее число массива: "+min); */
      /* 
      Scanner scanner = new Scanner(System.in) ;
      System.out.print("Из скольки букв будет ваше слово?: ");
      int value = scanner.nextInt();
      char[] arr = new char[value];

      for(int i = 0; i<arr.length; i++)
      {
         System.out.print("Введите букву: ");
         arr[i] = scanner.next().charAt(0);

      }
System.out.println("Ваше слово: ");
      for(char a : arr) 
      {
         System.out.print(a);

      }
      */
   }
}
 //Calculator.CalculatorMain();
    



