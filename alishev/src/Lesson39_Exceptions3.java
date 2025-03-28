import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson39_Exceptions3 {
    public static void main(String[] args) {
        // Checked exceptions (Compile time exceptions) - надо обязательно обработать, ИДЕ и так подсветит
        // Unchecked exceptions (Runtime exceptions) - неослежимые, какая-то ошибка в работе программы
        // unchecked - не надо обрабатывать, а надо исправлять ошибку программы
        // всё, что джава подсвечивает при написании кода - checked exceptions

        /// checked exception ///
        File file = new File("test");
        try{
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        /// unchecked exception
        // то есть IDE это не подсвечивает, но при выполнении программы появляется ошибка
        int a = 1 / 0;

        /// тоже unchecked
        String name = null;
        name.length();

        /// тоже unchecked
        int[] arr = new int[2];
        System.out.println(arr[2]); // то есть в массиве два елемента, а мы пытаемся вывести третий
    }
}
