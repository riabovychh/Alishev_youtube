public class Lesson19_This {
    // чтоб в методе обратиться к переменной класса, надо в методе возле этой переменной прописать this.
    // ключевое слово this вызывает переменную обьекта внутри класса
    public static void main(String[] args) {
        Human1 human1 = new Human1();
        human1.setAge(18);
        human1.setName("Tom");
        human1.getInfo();
        Human1 human2 = new Human1();
        human2.setAge(20);
        human2.setName("Jack");
        human2.getInfo();
    }
}
class Human1 {
    String name;  // переменная класса
    int age;

    public void setName(String name) {   // переменная метода
        this.name = name;  // this.name = тот, который принадлежит обьекту, а не методу
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}
