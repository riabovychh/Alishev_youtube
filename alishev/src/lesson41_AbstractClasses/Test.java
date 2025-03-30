package lesson41_AbstractClasses;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        // абстр.методы, переопределенные в своих классах
        dog.makeSound();
        cat.makeSound();
        // неабстр.метод класса-родителя Animal
        cat.eat();
        dog.eat();


    }
}
