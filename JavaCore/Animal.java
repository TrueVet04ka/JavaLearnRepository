public class Animal {
    private String name;
    private int age;

    Animal()
    {
        this.name="Unnamed";
        this.age=0;

    }

   public void setFields(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name; 
    }
    public void setAge(int age)
    {
        this.age = age; 
    }
    public String GetName(){
    return name;
    }
    public int GetAge()
    {return age;}
    
    void makeSound()
    {
    System.out.println("Животные звуки");
    }
}
