public class MathOperations {
    // Напишите рекурсивный метод для вычисления факториала числа в классе MathOperations.
    public static int recursion(int x)
    {

        if (x<=1)
        return 1;
        else
        return x * recursion(x-1);
    }
}
