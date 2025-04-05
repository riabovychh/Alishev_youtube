package lesson45_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");  // файл, с которого считываем
            ObjectInputStream ois = new ObjectInputStream(fis); // инструмент для считывания файла

            Person person1 = (Person) ois.readObject();  // readObject возвращает обьект класса Object, из-за этого делаем down casting
            Person person2 = (Person) ois.readObject();

            // так как мы переопределили метод toString в классе Person, он выдаст id и name
            System.out.println(person1);
            System.out.println(person2);


            /// ЧТЕНИЕ МАССИВА ОБЬЕКТОВ
            int personCount = ois.readInt();  // выводим кол-во обьектов
            Person[] people = new Person[personCount];// cоздаем массив, куда будем класть обьекты для считывания
            for (int i = 0; i< personCount; i++){  // кладем все обьекты в массив
                people[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(people));

            ////// ЧТЕНИЕ МАССИВА, ЗАПИСАННОГО ЦЕЛИКОМ СРАЗУ
            Person[] people2 = (Person[]) ois.readObject();  // записываем считанный массив в массив people2
            System.out.println(Arrays.toString(people2));

            ois.close(); // в конце обязательно закрываем

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
