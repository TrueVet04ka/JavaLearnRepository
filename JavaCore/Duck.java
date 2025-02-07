public class Duck implements Animal, Flyable, Swimmable{
    @Override
   public void makeSound()
    {
        System.out.println("Кря");
    }
    @Override
    public void sleep()
    {
        System.out.println("Duck is sleeping");

    }
    @Override
    public void fly()
    {
System.out.println("Duck is flying");
    }
    @Override
    public void swim()
    {
        System.out.println("Duck is swimming");
    }
}
