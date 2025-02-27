public class Lesson15_Methods {
    public static void main(String[] args) {
        // в этом блоке данные человека
        Persons person1 = new Persons();  // новый обьект класса Person
        person1.setNameAndAge("Таня", 30);
//        person1.name = "Таня";
//        person1.age = 30;
        person1.speak(); // запускаем метод speak у Тани

        Persons person2 = new Persons();
        String s2 = "Сережа";

//        person2.name = "Сережа";
        person2.setNameAndAge(s2, 34);
//        person2.age = 34;
        person2.sayHello();
        person2.speak();

        int year1 = person1.calculateYearsToRetirement2();
        int year2 = person2.calculateYearsToRetirement2();

        System.out.println("Первому человеку до пенсии: "+year1+" лет");
        System.out.println("Второму человеку до пенсии: "+year2+" лет");

    }
}

        class Persons {   // в этом блоке мы создаем класс человека
            String name;
            int age;


            // на месте void передаем тип возвращаемого значение
            // void - возвращает ничто
//            void calculateYearsToRetirement() {
//                int years = 65-age;
//                System.out.println("Количество лет до пенсии: "+years);
//            }

            int calculateYearsToRetirement2() {
                int years = 65-age;
                return years;  // return - финальная точка в методе, то есть его выход
                // переменная в return должна быть обязательно того же типа, что и метод
            }

            void speak() {     // создали метод (c маленькой буквы), чтоб человек мог представиться
                for (int i = 0; i < 3; i++) {   // чтоб человек представился 3 раза
                    System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
                }
            }

            void sayHello() {
                System.out.println("Привет!");
            }

            void setNameAndAge(String userName, int userAge) {
                name = userName;
                age = userAge;
            }
        }

