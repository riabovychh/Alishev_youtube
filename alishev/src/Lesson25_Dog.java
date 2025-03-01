public class Lesson25_Dog extends Lesson25_Animal { // это значит, что класс Dog есть наследником класса Animal
    // теперь у этого класса есть методы родительского класса
    public void bark(){
        System.out.println("I am barking");  // гавкает только собака
    }

    // наследник может переопределять методы предка
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void showName(){
        System.out.println(name);   // у класса Dog нет переменной name, но она есть у родительского класса
    }
}
