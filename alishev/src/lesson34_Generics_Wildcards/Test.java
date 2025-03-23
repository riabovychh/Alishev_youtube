package lesson34_Generics_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);

    }

    /*
    Иерархия наследования:
    Object  ->  Animal  ->  Dog

    extends Animal - берет обьекты класса Animal и Dog
    super Animal - берет обьекты класса Animal и Object
     */

    private static void test (List<? extends Animal> list) {  // вместо указания в листе конкретного типа обьекта,
        // указываем знак вопроса - он значит, что я могу передать в этот лист любые обьекты
        // можно указать <? extends Animal> - это значит, что могут быть бьекты класса Animal и любые наследники этого класса
        // в цикле foreach указываем обьекты класса Object
        for(Animal animal: list){
            animal.eat();
        }
    }

    // super - значит будут браться Animal и классы выше (родительские классы Animal-a)
    private static void test2 (List <? super Animal> list2){
        System.out.println("bla");
    }
}
