package lesson29_Polymorphysm;

public class Main2_transformation {
    public static void main(String[] args) {

        Dog dog = new Dog();
        // Upcasting - восходящеее преобразование (от потогмка к родителю) - происходит неявно, джава сама всё делает
        Animal animal = dog; // наша собака стала животным
        Animal animal1 = new Dog(); // или можно прописать так

        // Downcasting - нисходящее преобразование (от родителя к потомку)
        Dog dog2 = (Dog) animal; // указываем джаве, что этот animal будет собакой
        dog2.bark();

        // почему downcasting небезопасный
        Animal a = new Animal();
        Dog doggi = (Dog) a; // это преобразование не меняет обьект, оно меняет ссылку на обьект
        doggi.bark(); // при запуске выдает ошибку типа "Animal cannot be cast to dog", то есть джава все равно воспринимает doggi как животное





    }
}
