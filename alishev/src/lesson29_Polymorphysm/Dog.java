package lesson29_Polymorphysm;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }

    public void eat(){     // переопределили родительский метод
        System.out.println("Dog is eating");
    }
}
