import java.sql.SQLOutput;

public class Lesson18_Setters_Getters_Incapsulation {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("");
        human1.setAge(-2);
        System.out.println("Выводим значение имени в main методе: "+ human1.getName());
        System.out.println("Выводим значение возраста в main методе: " + human1.getAge());


    }
}

class Human{
    private String name;  // если указано private - значит переменная может использоваться только в этом классе
    private int age;

    public void setName(String humansName){// setter
        if (humansName.isEmpty()) {  // isEmpty - выводит true, если ввел пустую стрингу, и false, если что-то есть
            System.out.println("Ты ввел пустое имя");
        } else {
            name = humansName;
        }
    }

    public String getName(){   // getter
        return name;
    }

    public void setAge(int humansAge) {// setter
        if (humansAge < 0) {
            System.out.println("Возраст должен быть положительный");
        } else {
            age = humansAge;
        }
    }

    public int getAge(){   // getter
        return age;
    }

    int calculateYearsToRetirement(){
        int yearsRetired = 65-age;
        return yearsRetired;
    }

    void speak(){
        System.out.println("My name is " + name+" and I am " + age + " years old.");
    }

    void sayHello(){
        System.out.println("Hello!");
    }
}