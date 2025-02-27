public class Lesson12_Massive2_ForEach {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "JAVA";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++) {  // обычный for
            System.out.println(strings[i]);
        }

        System.out.println();  // пустая строка

        for (String string : strings) {  // for-ech - тип данных, имя переменной, название массива
            System.out.println(string);   // cуть такая же, как в обычном for
        }

        int[] numbers1 = {1,2,3};
        int sum = 0;
        for (int x: numbers1) {   // считаем сумму элементов массива
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);

    }
}
