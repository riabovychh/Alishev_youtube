package lesson45_Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        // запись обьектов на жесткий диск - сериализация
        // FileOutputStream - записывает байты в файл (может записывать объекты, записи и пр.)
        // ObjectOutputStream - записывает исключительно обьекты файла (более конкретный, узкоспециализированный)
        // но ему для записи нужен более обширный обьект класса FileOutputStream
        // то есть ObjectOutputStream берет любой обьект, превращает его в последовательность байтов,
        // и записывает эту последовательность в файл FileOutputStream
        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); // указываем файл, куда будут записываться обьекты (можно без указания формата файла, но обычно так)
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1); // записываем обьекты в файл
            oos.writeObject(person2);

            fos.close(); // обязательно в конце закрывать
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /////// СЕРИАЛИЗАЦИЯ МАССИВОВ ////////
        Person[] people = {new Person(3, "Steve"),
                new Person(4, "Damian"),
                new Person(5, "Joe") };

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); // указываем файл, куда будут записываться обьекты (можно без указания формата файла, но обычно так)
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length); // записываем в файл длину массива

            for(Person person: people) {
                oos.writeObject(person);  // записываем в массив в файле каждый обьект
            }

            fos.close(); // обязательно в конце закрывать
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /////// ДРУГОЙ СПОСОБ ЗАПИСИ МАСИВОВ В ФАЙЛ (более простой, записываем 1 обьект - массив сразу) /////
        Person[] people2 = {new Person(6, "Tom"),
                new Person(7, "Jack"),
                new Person(8, "Benedict") };

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); // указываем файл, куда будут записываться обьекты (можно без указания формата файла, но обычно так)
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people2);  // записываем сразу весь массив

            fos.close(); // обязательно в конце закрывать
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
