
public class Main {
 
    public static void main(String[] args)
    {
        Animal cat = new Cat();
        Animal dog = new Dog();
        
        // cat.makeSound();;
        // dog.makeSound();
        Zoo zoo = new Zoo();
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
    }

   
}



