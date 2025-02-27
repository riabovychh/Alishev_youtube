public class Lesson14_ClassesAndObjects {
        public static void main(String[] args) {
            Person person1 = new Person();  // новый обьект класса Person
            person1.name = "Таня";
            person1.age = 30;
            System.out.println("Меня зовут " + person1.name+", мне "+person1.age+" лет");

            Person person2 = new Person();
            person2.name = "Сережа";
            person2.age = 34;
            System.out.println("Моего мужа зовут "+person2.name+", и ему "+person2.age+" года");

        }
    }
    class Person {
        // у класса могут быть:
        // 1. Данные(поля)
        // 2. Действия, которые он может совершать (методы)
        String name;
        int age;
    }

