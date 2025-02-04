public class Cat extends Animal
{
    private String modificator;
    private boolean tail;

    Cat()
    {
        modificator = "It's a ordinary cat";
        tail = true;
    }
    Cat(String name, int age, String modificator, boolean tail)
    {
        setName(name);
        setAge(age);
        this.modificator = modificator;
        this.tail = tail;
    }
    public void setModificator(String modificator)
    {
        this.modificator = modificator;
    }
    public void setTail(boolean tail)
    {
        this.tail = tail;
    }
  
    public String GetModificator()
    {
        return modificator;
    }
    public boolean GetTail()
    {
        return tail;
    }

 @Override
 void makeSound() {

     super.makeSound();
     System.out.println("MYAAAAAAAAAAAW");
 }
}