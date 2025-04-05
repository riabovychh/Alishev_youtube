package lesson45_Serialization.lesson47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject1 {
        public static void main(String[] args) {
            Person1 person1 = new Person1(1, "Mike");
            // try with resources - когда класс реализует интерфейс Closable
            // в таком try можно не закрывать в конце поток (он закрывается сам)
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
//                FileOutputStream fos = new FileOutputStream("people.bin");
//                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(person1);

//                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
