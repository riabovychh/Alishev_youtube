package lesson45_Serialization.lesson47;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject1 {
    public static void main(String[] args) {
        // try with resources - когда класс реализует интерфейс Closable
        // в таком try можно не закрывать в конце поток (он закрывается сам)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
//            FileInputStream fis = new FileInputStream("people.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);
            Person1 person1 = (Person1) ois.readObject();
            System.out.println(person1);

//            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
