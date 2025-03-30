public class Lesson42_EqualsAndStringPool {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println("Cравниваем примитивы:");
        System.out.println(x == y); // сравниваем примитивы

        System.out.println("Сравниваем обьекты: ");
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        boolean throughSout = animal2 == animal1;

        System.out.println("Просто через sout: " + throughSout);  // вернет false, так как сравниваются ссылки на обьекты, а они всегда разные

        ///  equals - метод для сравнения обьектов (определен в классе Object)
        System.out.println("метод equals:" + animal1.equals(animal2));

        // при этом
        Animal animal3 = animal2;
        System.out.println(animal3 == animal2);

        ///////////////  СРАВНИВАЕМ СТРОКИ ///////////////
        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1 == string2); // вернет true из-за StringPool
        // StringPool - когда джава при создании второй строки с таким же значением не создает под неё отдельный объект,
        // а просто ссылает вторую стрингу на первую

        // при этом
        String string3 = new String("Hello");
        String string4 = new String("Hello");

        System.out.println(string3 == string4); // вернет false, так как String Pool уже не сработает

        // также
        String a = "hello";
        String b = "hello123".substring(0, 5); // выбираем строку от нулевого элемента до пятого (невключительно)

        System.out.println(b);
        System.out.println(a == b); // вернет false, так как джава всё-таки создала два разных обьекта
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object object) {  // не можем на входе указать сразу обьект класса Animal,
        // так как в классе Object этот метод принимает на вход обьект класса Object
        Animal otherAnimal = (Animal) object; // указываем, что принимаемых на входе object - это Animal
        return this.id == otherAnimal.id;
    }
}