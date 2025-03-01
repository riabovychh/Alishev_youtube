package interfaces;

public class Test {
    public static void main(String[] args) {
        Lesson25_Animal animal1 = new Lesson25_Animal(1);
        Person person1 = new Person("Bob");
//        animal1.sleep();
//        person1.sayHello();
//        animal1.showInfo();
//        person1.showInfo();

        Info info1 = new Lesson25_Animal(1);  // можем делать так из-за того, что классы Animal и Person реализуют этот интерфейс
        Info info2 = new Person("Bob");   // но таким образом у этих обьектов будет доступ только к методам интерфейса (без методов класса)
//        info1.showInfo();
//        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);

        outputInfo(animal1); // можем использовать этот метод, потому что класс Animal реализует интерфейс Info
        outputInfo(person1); // можем использовать этот метод, потому что класс Person реализует интерфейс Info
    }

    public static void outputInfo(Info info){  // метод принимает на вход нечто, что реализует интерфейс Info
        info.showInfo();  // теперь этот метод может реализовать любой обьект, класс которого реализует интерфейс Info
    }
}
