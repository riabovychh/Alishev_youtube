public class Lesson20_Constructors {
    // если конструктор не прописан, он создается джавой по умолчанию
    // джава определяет, какой конструктор вызвать, исходя из данных, которые мы указываем при создании обьекта класса
    // важно не перегружать конструкторы (не создавать несколько с одинаковымы параметрами на входе (в круглых скобках)
    public static void main(String[] args) {
        Human2 human1 = new Human2();  // если будет пустим, джава поймет, что это вызывается первый конструктор
        Human2 human2 = new Human2("Bob");  // вызвется второй конструктор
        Human2 human3 = new Human2("John", 19); // вызвется третий конструктор
        // если оставить только третий конструктор, то тогда нельзя будет создавать обьект класса Human2 без указания сразу имени и возраста

    }
}

class Human2 {

    private String name;
    private int age;

    public Human2() {  // первый конструктор (как дефолтный, то есть если нет конструкторов, он и так под капотом создастся
        System.out.println("Привет из первого конструктора");
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human2(String name){
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human2(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}
}