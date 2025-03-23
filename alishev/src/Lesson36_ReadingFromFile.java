import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson36_ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        // считывание с файла
        String separator = File.separator; // это сепаратор, который разделяет папки (на маке - / , на винде - \
        // java сама определяет сепаратор, в зависимости от OS
        // путь к файлу (через командную строку путь к папке - pwd, плюс еще подставляем название самого файла
        // то есть в данном случае у меня путь к файлу - /Users/tetianariabovych/Desktop/test
        String path = separator + "Users" + separator + "tetianariabovych" + separator + "Desktop" + separator + "test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);

        //////// вывод строк
        while (scanner.hasNextLine()) {  // этот метод возвращает true, если в файле еще есть строки
            System.out.println(scanner.nextLine());
        }

        /////// вывод всех значений, что указаны в строке через пробел (например, 1 2 3 4)
        String line = scanner.nextLine(); // знаем, что в файле просто 1 строка
        String[] numbersString = line.split(" "); // в массив вставляем данные из строки, которые отделены пробелом
        // если сепаратор - точка, указываем её как "\\."
        int[] numbersInt = new int[4];
        int counter = 0;  // чтоб он указывал на индекс

        for(String number : numbersString) {
            numbersInt[counter++] = Integer.parseInt(number);  // парсит строки в числа int и помещает их в массив numbersInt
        }

        System.out.println(Arrays.toString(numbersInt));


        ////////// в конце обязательно закрываем сканнер (для обеих выводов)
        scanner.close();

        // если файл лежит в нашем проекте, можно прописать его как File file = new File("file_name");
        // java сама поймет, что это файл из этого каталога


    }
}
