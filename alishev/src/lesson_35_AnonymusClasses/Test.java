package lesson_35_AnonymusClasses;

interface AbleToEat {
    public void eat();
}

class Animal implements AbleToEat {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}



//class OtherAnimal extends Animal {
//    public void eat() {
//        System.out.println("Other animal is eating...");
//    }
//}

public class Test {
    public static void main (String[] args) {
        Animal animal = new Animal();
        animal.eat();

//        OtherAnimal otherAnimal = new OtherAnimal();
//        otherAnimal.eat();


        // при таком создании обьекта под капотом создаеся новый класс, который переопределяет метод eat()
        // чтоб не писать так, как написано выше и закомменчено
        // то есть в переменной animal2 лежит не обьект класса Animal, а обьект наследного класса Animal-a
        Animal animal2 = new Animal() {
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };

        animal2.eat();

        AbleToEat ableToEat = new Animal(); // создаем обьект класса Animal, сослав его на интерфейс
        ableToEat.eat();  // тут будет использоваться метод класса Animal

        // а в таком кейсе под капотом создается новый анонимный класс, который имплементит интерфейс AbleToEat
        // для одноразового использования
        AbleToEat ableToEat1 = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
    }
}

