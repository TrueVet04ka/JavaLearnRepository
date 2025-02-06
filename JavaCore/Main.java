
public class Main {
 
    public static void main(String[] args)
    {
        // Полиморфизм (Polymorphism)
        // Начальный уровень
        // Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog и Cat, которые реализуют интерфейс.
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();

        // Средний уровень
        // Напишите метод public static void animalSound(Animal animal), который принимает объект типа Animal и вызывает makeSound(). Передайте в него разные объекты.
        
        // Продвинутый уровень
        // Создайте метод, который принимает список List<Animal> и вызывает у каждого makeSound(). Используйте instanceof, чтобы выполнить дополнительное поведение для Dog и Cat.
    }

   
}



