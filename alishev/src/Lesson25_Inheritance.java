public class Lesson25_Inheritance {
    public static void main(String[] args) {
        Lesson25_Animal animal = new Lesson25_Animal();
        animal.eat();
        animal.sleep();
        Lesson25_Dog dog = new Lesson25_Dog();
        dog.eat(); // вызывается метод,переопределенный у наследника
        dog.sleep();
        dog.bark();
        dog.showName();
    }
}
