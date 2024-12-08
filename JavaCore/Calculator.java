package JavaCore;
import java.util.Scanner;

public class Calculator {

public static void CalculatorMain(){
String whiler = "Y";
while (whiler == "Y") {
System.out.println("Это калькулятор");

System.out.print("Введите желаемую операцию: ");
Scanner scan = new Scanner(System.in);
String Operation = scan.nextLine();


System.out.print("Введите первое число: ");
scan = new Scanner(System.in);
int num1 = scan.nextInt();


System.out.print("Введите второе число: ");
scan = new Scanner(System.in);
int num2 = scan.nextInt();


if (Operation == "+") {
 int res = num1 + num2;
 System.out.println("Результат операции: "+ res);
}
else if (Operation == "-") {
    int res = num1 - num2;
    System.out.println("Результат операции: "+ res);
}
else if (Operation == "*") {
    int res = num1 * num2;
    System.out.println("Результат операции: "+ res);
}
else if (Operation == "/") {
    int res = num1 / num2;
    System.out.println("Результат операции: "+ res);
}

System.out.print("Продолжаем? (Y/N): ");
scan = new Scanner(System.in);
whiler = scan.nextLine();
scan.close();
    
}

}


}
