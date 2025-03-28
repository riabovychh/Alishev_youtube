import java.io.IOException;
import java.util.Scanner;

public class Lesson38_Exceptions2 {
    public static void main(String[] args) throws Lesson38_ScannerException {
        /// // ВЫБРАСЫВАНИЕ ИСКЛЮЧЕНИЙ //////////
        Scanner scanner = new Scanner(System.in);
        while(true){  // типа бесконечный цикл
            int x = Integer.parseInt(scanner.nextLine());

            if (x!=0) {
                throw new Lesson38_ScannerException("Пользователь ввел что-то кроме нуля!!");
//                try {
//                    throw new IOException(); // возникает при вводе/выводе чего-либо (Input/Output exception)
//                } catch (IOException e) {
//                    System.out.println("Пользователь ввел что-то кроме нуля");;
//                }
            }
        }
    }
}
