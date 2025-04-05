package lesson45_Serialization.lesson47;

import java.io.Serial;
import java.io.Serializable;

// если не хотим, чтоб поле было сериализовано, в месте декларирования пишем ему ключ.слово transient
// в таком случае, если это String - будет записано null, если int - будет 0 (то есть берутся значения по умолчанию

public class Person1 implements Serializable {
    @Serial
    private static final long serialVersionUID = 3429928276289435935L;  // идейка сама предложила подставить после настроек ниже
    private transient int id;
    private String name;


 // если класс имплементит интерфейс Serializable, иногда среда разработки может требовать указать SerialVersionUID
    // для этого надо зайти Intellij IDEA (слева сверху) -> Settings -> Editor -> Inspections -> JVM Languages ->
    // -> проставляем галочку на "Serializable class without 'serialVersionUID'

    public Person1 (int id, String name) {
        this. id = id;
        this.name = name;
    }

    public int getId() {return id;}
    public String getName() { return name; }
    public String toString() { return id + " : " + name;}
}
