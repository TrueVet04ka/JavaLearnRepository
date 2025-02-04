

public class Main {
            // Операторы if-else
            // Базовые упражнения
    // Проверка четности числа: Напишите программу, которая принимает целое число и проверяет, является ли оно четным или нечетным.
    public void ex1(int n)
    {
 
     if( n % 2 == 0)
     {
 System.out.println("Число чёткое");
     }
    else
    {
     System.out.println("Нечёткое");
    }
}
 // Проверка положительного числа: Напишите программу, которая определяет, является ли введенное число положительным, отрицательным или нулем.
    public void ex2(int n)
    {
        if (n>0)
            System.out.println(n + " Больше нуля");
        else if (n == 0)
            System.out.println(n + " Равняется нулю");
        else if (n < 0)    
             System.out.println(n + " Меньше нуля");
        else
            System.out.println("EXEPTION Типо");
    }
    public static void main(String[] args)
    {
       
        int a = 2000;      
        int d = 0;
        Main obj = new Main();
        obj.ex1(a);
        obj.ex2(a);



        
        
        
       
        
        
        

        
        
    
        

   }
   
  
}



