public interface Animal {
  default void makeSound()
    {

System.out.println("Animal sound");
    }
    default void sleep()
    {
        System.out.println("Animal sleep");
    }
}
