package lesson29_Polymorphysm;

public class Main {
    public static void main(String[] args) {
        // рассматриваем собаку как животное, но по дефолту будут применятся методы именно собаки
        Animal animal = new Dog();  // одна из проявлений полиморфизма, но из-за этого нет доступа к методам именно дочернего класса (bark)
        animal.eat();
    //    animal.bark(); - нет доступа
        // рассматриваем собаку как собаку
        Dog dog = new Dog(); //есть доступ и к родительскому eat (до переопределения), и к своему bark
        dog.eat();
        dog.bark();

        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat = new Cat();

        test(animal1);
        test(dog1);  // вызвется переопределенный метод
        test(cat);

    }

    public static void test(Animal animal){
        animal.eat();
    }
}
