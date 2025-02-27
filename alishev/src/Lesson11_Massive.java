public class Lesson11_Massive {
    public static void main(String[] args) {
      int number = 10; // примитивный тип данных (лежат в коробке  - [10])
//      char character = 'a'; // примитивный тип данных (лежат в коробке)
//      String s = "abc"; // ссылочный тип данных (ссылаются на объекты -   s -> "string")
//      String s1 = new String("Hello"); // то же, что и строка 5
        int[] numbers = new int[5]; // создали новый массив с 5 элементами (тоже ссылочный тип данных  - numbers -> [массив])
        // инициализация массивов
//        numbers[0] = 10; // можно так
//        numbers[1] = 20;
        for (int i = 0; i < numbers.length; i++) { // индексируем
            numbers[i] = i*10;
        }
        for (int i = 0; i < numbers.length; i++) {   // выводим массив
            System.out.println(numbers[i]);
        }
        int[] numbers2 = {1,2,3};      // можно инициализировать сразу так
        for (int i = 0; i < numbers2.length; i++) {  // выводим
            System.out.println(numbers2[i]);
        }

    }
}
