public class Lesson24_Object_ToString {
    public static void main(String[] args) {
        // класс Object есть во всех классах (под капотом) - он как родитель всех классов в JAVA
        String string = "Hello";
        System.out.println(string);
        System.out.println(string.toString()); // то же, что и строка выше
        Human2 human = new Human2("Bob",40);
        human.toString();  // toString - метод класса Object, который возвращает hash-код (уникальный номер, присвоенный каждому обьекту)
        System.out.println(human.toString());

        // в lesson20 добавили метод public String toString() (эта часть метода называется сигнатура)
        // если у класса-наследника такая же сигнатура метода, как у класса-родителя, то при вызове реализуется метод класса-наследника
    }
}
