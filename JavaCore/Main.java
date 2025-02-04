

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
    // Определение максимального из двух чисел: Напишите программу, которая принимает два числа и выводит наибольшее из них.
    public void ex3(int n, int a )
    {
        if (n > a) 
            System.out.println(n + " Больше " + a);  
        else if (n == a)
        {
            System.out.println(n + " Равнo " + a);
        }          
        else
            System.out.println(a + " Больше " + n);

    }
                // Продвинутые упражнения
// Классификация возраста: Напишите программу, которая принимает возраст пользователя и выводит категорию (ребенок, подросток, взрослый, пожилой).
void ex4 (int n)
{
    if (n<14)
    {
        System.out.println("Малютка");
    }
    else if(n>=14 && n<18)
    System.out.println("Подросточек");
    else if(n>=18 && n<=55)
    System.out.println("Большой");
    else    
    System.out.println("Ваще старичок жесть");
}


    public static void main(String[] args)
    {
       
        int a = 2000;      
        int d = 0;
        Main obj = new Main();
        obj.ex1(a);
        obj.ex2(d);
        obj.ex3(d, a);
        obj.ex4(d);
        
        
        
       
        
        
        

        
        
    
        

   }
   
  
}



