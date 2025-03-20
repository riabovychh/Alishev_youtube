import java.util.*;

public class Lesson33_Generics {

    public static void main(String[] args) {
        /// /////////////////  Java 5 ///////////////////////////
        List animals = new ArrayList();
        // обьект класса List хранит в себе обьекты класса Object - родительский класс всех классов)
        animals.add("cat");
        animals.add("dog"); // 1
        animals.add("frog");

        String animal = (String) animals.get(1); // то есть мы в список добавляли обьект, а теперь нам надо сказать джаве,
        // что этот обьект - это стринга (down casting -спускание вниз по иерархии наследования)
        System.out.println(animal);

        /// //////////////// С появлением Generics /////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);  // тут уже не надо прописывать в скобках Strong, потому что мы при создании листа
        // указали, что в нем будут строки, а не просто обьекты


        /// ///////////////// Java 7 ///////////////
        List<String> animals3 = new ArrayList<>();  // то есть в ArrayList уже не обязательно тоже указывать String,
        // достаточно указать в List
    }
}
