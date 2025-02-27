public class Lesson21_Static {
    public static void main(String[] args) {
        Human3 h1 = new Human3("Bob", 30);
        Human3 h2 = new Human3("Tom", 40);
        Human3.description = "Nice"; // инициализация переменной класса, то есть мы не указываем конкретный обьект
        h1.getAllFields();
        h2.getAllFields();
        //   Human3.getDescription();  // вызов метода класса
        Human3.description = "Bad";  // изменение переменной класса
        h1.getAllFields();
        h2.getAllFields();
        System.out.println();

        h1.printNumberOfPeople();
        h2.printNumberOfPeople();

        Human3 h3 = new Human3("Rob",50);
        h3.printNumberOfPeople();

        //    System.out.println(Math.pow(2,4));    метод Math.pow приводит первое число в степень второго числа
// класс Math - хороший пример, так как у него нет какой-то ценности от переменных обьекта
    }
}

class Human3 {

    private String name;
    private int age;
    public static String description;  // static обозначает переменную класса
    private static int countPeople;  // статическая переменная - одна для всех объектов

    public Human3(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }


    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public static void getDescription() {  // метод класса
        System.out.println(description);
    }

    public void getAllFields(){
        System.out.println(name+","+age+","+description);
    }

    public static void printAllFields(){
        System.out.println(description);
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }
}
