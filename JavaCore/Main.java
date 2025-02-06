
public class Main {
 
    public static void main(String[] args)
    {
        // Полиморфизм (Polymorphism)
        // Начальный уровень
        // Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog и Cat, которые реализуют интерфейс.
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal.animalSound(cat);
        Animal.animalSound(dog);

        // Средний уровень
        // Напишите метод public static void animalSound(Animal animal), который принимает объект типа Animal и вызывает makeSound(). Передайте в него разные объекты.
        

        // Продвинутый уровень
        // Создайте метод, который принимает список List<Animal> и вызывает у каждого makeSound(). Используйте instanceof, чтобы выполнить дополнительное поведение для Dog и Cat.
    }

   
}



