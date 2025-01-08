package JavaCore;
import java.util.Scanner;

public class Calculator {

public static void CalculatorMain(){
    String whiler = "Y";
    do{
    System.out.println("Это калькулятор");
    
Scanner scanner = new Scanner(System.in);
System.out.print("Введите 1 число: ");
int num1 = scanner.nextInt();

scanner = new Scanner(System.in);
System.out.print("Введите 2 число: ");
int num2 = scanner.nextInt();

int res;

System.out.print("Действие: ");
String Action = scanner.next();

switch (Action) {
    case "+":
        res = num1 + num2;
        System.out.println("Результат: " + res);
        break;
    case "-":
        res = num1 - num2;
        System.out.println("Результат: " + res);
        break;
    case "*":
        res = num1 * num2;
        System.out.println("Результат: " + res);
        break;
     case "/":
        if (num2 == 0) {
            System.out.println("Делитель не может равняться 0");
        }
        else
        {
        res = num1 / num2;
        System.out.println("Результат: " + res);
        }
        break;
    default:
    System.out.println("Чёт не то");
        break;
}






























/*
String whiler = "Y";
do{
System.out.println("Это калькулятор");

System.out.print("Введите желаемую операцию: ");
Scanner scan = new Scanner(System.in);
String Operation = scan.next();


System.out.print("Введите первое число: ");
scan = new Scanner(System.in);
int num1 = scan.nextInt();


System.out.print("Введите второе число: ");
scan = new Scanner(System.in);
int num2 = scan.nextInt();


if (Operation.equals("+")) {
 int res = num1 + num2;
 System.out.println("Результат операции: "+ res);
}
else if (Operation.equals("-")) {
    int res = num1 - num2;
    System.out.println("Результат операции: "+ res);
}
else if (Operation.equals("*")) {
    int res = num1 * num2;
    System.out.println("Результат операции: "+ res);
}
else if (Operation.equals("/")) {
    int res = num1 / num2;
    System.out.println("Результат операции: "+ res);
}

System.out.print("Продолжаем? (Y/N): ");
scan = new Scanner(System.in);
whiler = scan.next();

    
}while (whiler.equals("Y") || whiler.equals("y"));
*/
System.out.print("Продолжаем? (Y/N): ");
scanner = new Scanner(System.in);
whiler = scanner.next();
}while (whiler.equals("Y") || whiler.equals("y"));
}


}
