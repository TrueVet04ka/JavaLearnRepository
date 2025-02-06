public interface Animal {

    public void makeSound();
    public static void animalSound(Animal animal)
    {
        animal.makeSound();
    };
}