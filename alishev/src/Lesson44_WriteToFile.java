import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lesson44_WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);

        System.out.println(System.in); // выводит данные в консоль
        pw.println("Test row 1");  // записывает данные в файл
        pw.println("Test row 2");

        pw.close(); // в конце обязательно закрывать (как Scanner)
    }
}
