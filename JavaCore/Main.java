

public class Main {
 
    public static void main(String[] args)
    {
     Cat cat = new Cat();
    cat.setName("Baarsik");
     System.out.println( cat.GetName());
     cat.makeSound();
     Dog dog = new Dog();
     dog.setName("sharik");
     dog.setVaccinated(true);
     dog.setBreed("Krutoy");
    System.out.println(dog.GetName() + " " + dog.getVaccinated() + " " + dog.getBredd());
   dog.makeSound();
    }

   
}



