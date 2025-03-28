import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson37_Exceptions1 {
    // если в сигнатуру метода дописать "trows FileNotFindException", это будет значить,
    // что этот метод возможно выбросит такой ексепшен
    public static void main(String[] args)  {
        File file = new File("test");

        try {
            Scanner scanner = new Scanner(file); // если тут словим ошибку, дальнейший код в блоке try не выполнится

            System.out.println("после Scanner-a");
        } catch (FileNotFoundException e) {
            // этот код выполнится только тогда, когда словим ексепшен
            System.out.println("Файл не найден");;  //  среда разработки предложила "throw new RuntimeException(e)"
        }
        System.out.println("После блока try-catch");

//        try {
//            readFile();
//        } catch (FileNotFoundException e) {
//            System.out.println("Обработка исключений в методе main");;
//        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("uygu");
        Scanner scanner = new Scanner(file);
    }
}
